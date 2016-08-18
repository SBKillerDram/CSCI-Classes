######################################### 	
#    CSCI 305 - Programming Lab #1		
#										
#  Nathan Doll			
#  puddendoll@gmail.com			
#										
#########################################

# Replace the string value of the following variable with your name.
my $name = "Nathan Doll";
print "CSCI Lab 1 submitted by $name\n\n";

# Checks for the argument, fail if none given
if($#ARGV != 0) {
    print STDERR "You must specificy the file name as the argument.\n";
    exit 4;
}

# Opens the file and assign it to handle INFILE
open(INFILE, $ARGV[0]) or die "Cannot open $ARGV[0]: $!.\n";


%WordsForTitles; #hash for storing words.
$NumberOfWords = 0; #number of words in the database

# This loops through each line of the file
while(<INFILE>) {
	$Line = $_;
	chomp($Line);
	$Line =~ s/.*>\s*//; # These three remove all the information before the song.
	$Line =~ s/.*>\s*//;
	$Line =~ s/.*>\s*//;
	$Line =~ s/\(.*//; # The ones from here to the next comment remove everythin after the characters below. I know I should be able to get this to work in a line or two of code but could not get that to work.
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
	$Line =~ s/\..*//; # These one remove punctuation
	$Line =~ s/\?.*//;
	$Line =~ s/\!.*//;
	$Line =~ s/\;.*//;
	$Line =~ s/\&.*//;
	$Line =~ s/\$.*//;
	$Line =~ s/\@.*//;
	$Line =~ s/\%.*//;
	$Line =~ s/\¿.*//;
	$Line =~ s/\¡.*//;
	if ($Line =~ /[^[:ascii:]]/)
	#if ($Line != /[\x00-\x7F]/)
	{
		$Line = "\n";
	}
	$Line = lc($Line); #sets to lowercase
	
	@wordsTemp = split(/ /, $Line); #divides line into each word
	$i = 0;
	while($wordsTemp[$i]) #inputs each word and the word after into my array data structure "terrible choise for this many titles but couldn't figure out a different one.
	{
		$key = $wordsTemp[$i]; #makes each word a key
		 
		if (defined $WordsForTitles{$key}) #if the key already exsists
		{
			$j = 0;
			$k = 0; #acts as boolean 0 not found 1 is found
			while ((${$WordsForTitles{$key}}[$j][0]) && ($k == 0)) #while loop for determining if a key needs to be made
			{
				if (${$WordsForTitles{$key}}[$j][0] eq ($wordsTemp[$j+1]))
				{
					if ((${$WordsForTitles{$key}}[$j][0] ne "the") && (${$WordsForTitles{$key}}[$j][0] ne "a") && (${$WordsForTitles{$key}}[$j][0] ne "an") && (${$WordsForTitles{$key}}[$j][0] ne "and") && (${$WordsForTitles{$key}}[$j][0] ne "or") && (${$WordsForTitles{$key}}[$j][0] ne "to") && (${$WordsForTitles{$key}}[$j][0] ne "of") && (${$WordsForTitles{$key}}[$j][0] ne "for") && (${$WordsForTitles{$key}}[$j][0] ne "from")) # eliminates key words by not allowing there frequencies to grow
					{
						${$WordsForTitles{$key}}[$j][1]++;
					}
					$k = 1; #found
				}
				$j++;
			}
			if (($k == 0) && ($key ne $wordsTemp[$j+1])) #if not found
			{
				${$WordsForTitles{$key}}[$j][0] = $wordsTemp[$j+1];
				${$WordsForTitles{$key}}[$j][1] = 1; 
			}
		}
		else #if key doesnt exsist
		{
			${$WordsForTitles{$key}}[0][0] = $wordsTemp[$i+1];
			${$WordsForTitles{$key}}[0][1] = 1;
		}	
		$i = $i + 1;
	} 	
}

# Close the file handle
close INFILE; 

print "File parsed. Bigram model built.\n"; #finally done
print "Enter a word [Enter ‘q’ to quit]:\n"; #user interface
$Title = <STDIN>; #takes user input
chomp($Title); #removes end of line character
$word = lc($Title); #sets user input to lowercase
while ($word ne "q") #prints title find first mentioned most frequent next word
{
	print "\nType 1 to look at all words that come after\nType anything else to generate a title\n"; #second user interface
	$CHOOSE = <STDIN>;
	chomp($Title); #removes end of line character
	$choise = $CHOOSE;
	if ($choise == "1") #choose to either print out info on word
	{
		print "The words that come after $word and how often they appear are:\nWord   Frequency\n";
		if (defined $WordsForTitles{$word})
		{
			$m = 0;
			while (${$WordsForTitles{$word}}[$m][0])
			{
				print "${$WordsForTitles{$word}}[$m][0]   ${$WordsForTitles{$word}}[$m][1]\n";
				$m++;
			}
		}
		else
		{
			print "Word does not exsist in database\n";
		}
	}
	else #or prints out title
	{
		print "$word"; #prints first word of the title
		$count = 0;
		while ($count < 20) # keeps the title within 20 words
		{
			if (defined $WordsForTitles{$word})
			{
				$largest = 0;
				$identifier = 0;
				$n = 0;
				while (${$WordsForTitles{$word}}[$n][0])
				{
					if (${$WordsForTitles{$word}}[$n][1] > $largest)
					{
						$identifier = $n;
						$largest = ${$WordsForTitles{$word}}[$n][1];
					}
					$n++;
				}
				$word = ${$WordsForTitles{$word}}[$identifier][0];
			}
			print " $word";
			$count++;
		}
		print "\n"; #finally done
	}
	print "Enter a word [Enter ‘q’ to quit]:\n"; #user interface
	$Title = <STDIN>; #takes user input
	chomp($Title); #removes end of line character
	$word = lc($Title);
}
