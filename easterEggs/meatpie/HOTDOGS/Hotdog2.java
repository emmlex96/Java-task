import java.util.Scanner;

    public class Hotdog2{

    public static void main(String[]args ){

    Scanner apple = new Scanner(System.in);
    System.out.print("What is lenght of the sides?:");


     int lenght = apple.nextInt();
    
    float num = 0.433f;
    int lenghtsquare = lenght*lenght;
    double calcArea = num * lenghtsquare;

        System.out.printf("The area of an Equilaterial Triangle with lenght:%d is %f %n%n",lenght, calcArea );

      }
}
