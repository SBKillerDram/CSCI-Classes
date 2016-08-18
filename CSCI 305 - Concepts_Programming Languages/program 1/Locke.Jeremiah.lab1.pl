######################################### 	
#    CSCI 305 - Programming Lab #1		
#										
#  < Jeremiah Locke >			
#  < jjlockemt@yahoo.com >			
#										
#########################################

# Replace the string value of the following variable with your names.
my $name = "Jeremiah Locke";
my $partner = "David Walz";
print "CSCI 305 Lab 1 submitted by $name and $partner.\n\n";

# Checks for the argument, fail if none given
if($#ARGV != 0) {
    print STDERR "You must specify the file name as the argument.\n";
    exit 4;
}

# Opens the file and assign it to handle INFILE
open(INFILE, $ARGV[0]) or die "Cannot open $ARGV[0]: $!.\n";


# YOUR VARIABLE DEFINITIONS HERE...
%hash;	#hashtable for the bi-gram counter


# This loops through each line of the file
while(<INFILE>) {

	$Line = $_;
	chomp($Line);
	
	# Step 1 remove all the information before the song
	$Line =~ s/.*>\s*//; 
	$Line =~ s/.*>\s*//;
	$Line =~ s/.*>\s*//;
		
	# Step 2 remove all the special symbols and everything after them
	$Line =~ s/\(.*//;
	$Line =~ s/\[.*//;
	$Line =~ s/\{.*//;
	$Line =~ s/\\.*//;
	$Line =~ s/\/.*//;
	$Line =~ s/\".*//;
	$Line =~ s/\-.*//;
	$Line =~ s/\_.*//;
	$Line =~ s/\`.*//;
	$Line =~ s/\+.*//;
	$Line =~ s/\=.*//;
	$Line =~ s/\.feat.*//;
	$Line =~ s/\:.*//;
		
	# Step 3 remove punctuation
	$Line =~ s/\..*//;
	$Line =~ s/\?.*//;
	$Line =~ s/\!.*//;
	$Line =~ s/\;.*//;
	$Line =~ s/\&.*//;
	$Line =~ s/\$.*//;
	$Line =~ s/\@.*//;
	$Line =~ s/\%.*//;
	$Line =~ s/\¿.*//;
	$Line =~ s/\¡.*//;	
		
	# Step 4 take out non-English stuff
	if ($Line =~ /[^[:ascii:]]/)
	{
		$Line = " ";
	}
	# Step 5 set to lowercase
	$Line = lc($Line);
	
	# Sets up Bi-gram model
	@temp = split (/ /, $Line);
	$i = 0;
	while($temp[$i]) #inputs each word and the word after into my array data structure
	{
		$key = $temp[$i]; #makes each word a key
		 
		if (defined $hash{$key}) #if the key already exists
		{
			$j = 0;
			$k = 0; #acts as boolean 0 not found 1 is found
			while ((${$hash{$key}}[$j][0]) && ($k == 0)) #decides if a key needs to be made
			{
				if (${$hash{$key}}[$j][0] eq ($temp[$j+1]))
				{
					# stop words
					if ((${$hash{$key}}[$j][0] ne "a") && (${$hash{$key}}[$j][0] ne "an") 
					&& (${$hash{$key}}[$j][0] ne "and") && (${$hash{$key}}[$j][0] ne "by") 
					&& (${$hash{$key}}[$j][0] ne "for") && (${$hash{$key}}[$j][0] ne "from") 
					&& (${$hash{$key}}[$j][0] ne "in") && (${$hash{$key}}[$j][0] ne "of") 
					&& (${$hash{$key}}[$j][0] ne "on") && (${$hash{$key}}[$j][0] ne "or")
					&& (${$hash{$key}}[$j][0] ne "out") && (${$hash{$key}}[$j][0] ne "the")
					&& (${$hash{$key}}[$j][0] ne "to") && (${$hash{$key}}[$j][0] ne "with"))
					{
						${$hash{$key}}[$j][1]++;
					}
					$k = 1; #found
				}
				$j++;
			}
			if (($k == 0) && ($key ne $temp[$j+1])) #if not found
			{
				${$hash{$key}}[$j][0] = $temp[$j+1];
				${$hash{$key}}[$j][1] = 1; 
			}
		}
		else #if key doesnt exsist
		{
			${$hash{$key}}[0][0] = $temp[$i+1];
			${$hash{$key}}[0][1] = 1;
		}	
		$i = $i + 1;
	} 	
}


# Close the file handle
close INFILE; 

# At this point (hopefully) you will have finished processing the song 
# title file and have populated your data structure of bigram counts.
print "File parsed. Bigram model built.\n\n";

# User control loop
print "Enter a word [Enter q to quit]: ";
$input = <STDIN>;
chomp($input);
print "\n";	
$lcInput = lc($input);
while ($lcInput ne "q")
{
	print "\nType 1 to generate title\nType anything else to print most common word that follows\n";
	$option = <STDIN>;
	chomp($input); #removes end of line character
	$choice = $option;
	if ($choice == "1") #print out title
	{
		print "$lcInput";
		$count = 0;
		
		while ($count < 20)
		{
			if (defined $hash{$lcInput})
			{
				my $mcw; #most common word temp var
				my $freq = 0; #frequency of that word
				my $temp = 0; # used for rand()
				$m = 0;
				while (${$hash{$lcInput}}[$m][0])
				{
					if ( ${$hash{$lcInput}}[$m][1] > $freq)
					{
						$freq = ${$hash{$lcInput}}[$m][1];
						$mcw = ${$hash{$lcInput}}[$m][0];
					}
					elsif ( ${$hash{$lcInput}}[$m][1] == $freq)
					{
						$temp = int(rand(2));
						if ( $temp == 1)
						{
							$freq = ${$hash{$lcInput}}[$m][1];
							$mcw = ${$hash{$lcInput}}[$m][0];
						}
					}
					$m++;
				}
				$lcInput = $mcw;
				print " $lcInput";
				$count++;
			}
			else
			{
				print " $lcInput\n";
			}
		}
	}
	else #prints out ncw that follows
	{
		if (defined $hash{$lcInput})
			{
				my $mcw; #most common word temp var
				my $freq = 0; #frequency of that word
				my $temp = 0; # used for rand()
				$m = 0;
				while (${$hash{$lcInput}}[$m][0])
				{
					if ( ${$hash{$lcInput}}[$m][1] > $freq)
					{
						$freq = ${$hash{$lcInput}}[$m][1];
						$mcw = ${$hash{$lcInput}}[$m][0];
					}
					elsif ( ${$hash{$lcInput}}[$m][1] == $freq)
					{
						$temp = int(rand(2));
						if ( $temp == 1)
						{
							$freq = ${$hash{$lcInput}}[$m][1];
							$mcw = ${$hash{$lcInput}}[$m][0];
						}
					}
					$m++;
				}
				print "The word that follows $lcInput the most is $mcw\n";
			}
			else
			{
				print "That word is not in the database\n";
			}
	}
		print "\n"; 
	
	print "Enter a word [Enter q to quit]:\n"; #user interface
	$input = <STDIN>; #takes user input
	chomp($input); #removes end of line character
	$lcInput = lc($input);
}
