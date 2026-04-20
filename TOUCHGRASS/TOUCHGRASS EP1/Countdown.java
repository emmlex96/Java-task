import java.util.Scanner;

    public class Countdown{
        
        public static void main(String[]args ){
        Scanner billy =new Scanner(System.in);
        
        System.out.print("Enter countdowm; ");
        
        int countdown = billy.nextInt();
        
        for(int i = countdown; i >= 1; i--){
        System.out.println(i);
        
        }
        System.out.println("Blast off!");
        }
        
        }
