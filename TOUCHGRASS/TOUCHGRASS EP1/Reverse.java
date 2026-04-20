import java.util.Scanner;

   public class Reverse{
   
    public static void main(String[]args ){
     
     Scanner Apple = new Scanner(System.in);
     System.out.print("Enter a positive integer; ");
     int number = Apple.nextInt();
     
     if (number <= 0){
        System.out.print("Enter a positive integer.");
     
     }else {
        int original = number;
        int reverse = 0;
        
        while (number != 0){
            int digit = number %10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.print(original + "  " + reverse);
     }
    }
   }
