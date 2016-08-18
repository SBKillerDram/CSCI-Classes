#!/usr/bin/perl 

if($#ARGV != 0) {
    print STDERR "You must specify the file name as the argument.\n";
    exit 4;
}

open(INFILE, $ARGV[0]) or die "Cannot open $ARGV[0]: $!.\n";

print "Enter your name: ";
$name=<STDIN>;
print "Hello, ${name} ... you will soon be a perl addict!\n";

my @array;

while($line = <INFILE>) 
{

	# This prints each line. You will not want to keep this line.
	#print $line;


	my $data = $line;
	my @values = split('<SEP>', $data);
	#print "$values[3]\n";
	#$array[i] = $values[3];
	my $title = $values[3]; 
	
	if ($title =~/^[\x00-\x7F]+$/) 
	{
		$title =~ m/\Q(\E\K.+/;
		push(@array, $title); 
	}
	
}
print "@array";
print scalar(@array);


exit 0;