import java.util.Scanner;
   
   public class PowerOfTwo{
   
    public static void main(String[]args){
    
    Scanner power = new Scanner(System.in);
    System.out.print("Enter n : ");
       
       int n = power.nextInt();
       
       for(int number = 1; number <= n; number++) {
       
       System.out.printf("2^%d = %d%n", number);
       
       }
    }
    }
