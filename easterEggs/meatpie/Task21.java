 import java.util.Scanner;

    public class Task21{

     public static void main(String[]args ){

        Scanner input = new Scanner(System.in);

           System.out.print("enter base ");
        int base = input.nextInt();

        System.out.print("enter height: ");
        int heig = input.nextInt();

     int area = base*heig;

  System.out.println("area of triangle is: " + area);

   }
} 
