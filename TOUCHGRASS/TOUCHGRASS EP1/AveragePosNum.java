import java.util.Scanner;

public class AveragePosNum{

    public static void main(String[]args){
    
    Scanner light = new Scanner(System.in);
    double sum = 0;
    int count = 0;
    
        while(true){
            System.out.print("Enter a number(negative to stop): ");
            double number = light.nextDouble();
            
            if (number < 0) break;
            
            sum += number;
            count++;
            
                
        
        }
    
    }
    
    
    }
