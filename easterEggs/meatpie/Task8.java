import java.util.Scanner;

    public class Task8{
    
        public static void main(String[]args ){

    Scanner input = new Scanner(System.in);

    System.out.print("enter number:");
        int num = input.nextInt();
        
        int cube = num*num*num;
        System.out.print("the cube is: "+ cube);
   }
}
