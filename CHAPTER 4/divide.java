java drop the fractional part 

For example, 9 / 2 gives 4, not 4.5 .
To avoid this, cast at least one operand to double :
double result = (double) 9 / 2;
result = gives 4.5
