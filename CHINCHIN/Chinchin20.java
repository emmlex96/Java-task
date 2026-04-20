import java.util.Scanner;
public class Chinchin20 {
    public static void main (String[] args) {
    Scanner apple = new Scanner(System.in);

//   User instructions
      System.out.println("enter the first number");
       int numOne = apple.nextInt();

      System.out.println("enter the second number");
      int numTwo = apple.nextInt();

      System.out.println("enter the third number");
      int numThree = apple.nextInt();

       System.out.println("enter the forth number");
       int numFour = apple.nextInt();

      System.out.printf("%d%d%d%d ---- %d%d%d%d %n",numOne,numTwo,numThree,numFour,numFour,numThree,numTwo,numOne);

                }
}
