import java.util.Scanner;
public class Hotdog28{
public static void main(String[] args){
Scanner apple = new Scanner(System.in);
System.out.print("Enter side 1:");
double a = apple.nextDouble();
System.out.print("Enter side 2:");
double b = apple.nextDouble();
System.out.print("Enter side 3:");
double c = apple.nextDouble();
if(a == b && b == c){
System.out.printf("The triangle is EQUILATERAL.%n");
}
if(a == b && b != c){
System.out.printf("The triangle is ISOSCELES.%n");
}
if(a != b && b != c && a != c){
System.out.printf("The triangle is SCALENE.%n");
    }
}
}
