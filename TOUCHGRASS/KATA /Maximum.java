import java.util.Scanner;

    public class Maximum{
    
        public static void main(String[]args ){
        
        Scanner Max = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = Max.nextInt();
        System.out.print("Enter second number: ");
        int num2 = Max.nextInt();
        
        int max;
        if (num1 > num2){
            max = num1;
        
        }else {
            max = num2;
        }
        
        System.out.println("maximum is : " + max);
        }
    
    }
