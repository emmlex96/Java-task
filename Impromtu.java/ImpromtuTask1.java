import java.util.Scanner;
    
      public class ImpromtuTask1{
        
        public static void main(String[]args ){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("enter number");
        int sum = 0;
        int number = inputCollector.nextInt();
        while (number> 0){
        sum = sum + number % 10;
       number/=10;
        
        }
        System.out.println("sum is " + sum);
       }
        
        }
        
