import java.util.Scanner;

public class Bitterkola2{

public static void main(String[]args ) {

Scanner apple = new Scanner(System.in);

System.out.print("enter 5 digit: ");
int digit = apple.nextInt();

int first = digit / 10000;
int last = digit % 10;

int sum = first + last;
System.out.print("the sunm is: " + sum);
}
}
