import java.util.Scanner;

    public class Hotdog1{

      public static void main(String[]args ){
   Scanner apple = new Scanner(System.in);

    System.out.print("Distance in miles:");
    double miles = apple.nextDouble();
    double km = miles * 1.6;

    System.out.println(miles + "miles = " + km + " Kilometers");
   
  }
}
