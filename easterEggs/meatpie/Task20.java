 import java.util.Scanner;

    public class Task20{

     public static void main(String[]args ){

        Scanner input = new Scanner(System.in);

   System.out.print("enter length: ");
    int len = input.nextInt();

        System.out.print("enter width: ");
        int wid = input.nextInt();

int area = len*wid;

        System.out.print("Area is: " + area);
     }

}
