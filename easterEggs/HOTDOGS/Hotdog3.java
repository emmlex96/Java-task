 import java.util.Scanner;

    public class Hotdog3{

    public static void main(String[]args ){

    Scanner apple = new Scanner(System.in);
    System.out.print("What is the length of the sides?!");
int length = apple.nextInt();
float num = 0.433f;
int lengthSquare = length * length;
double calcArea =  num * lengthSquare;
System.out.printf("The area of an Equilaterial Triangle with length:%d is %n%n",length, calcArea);           
 }
}
