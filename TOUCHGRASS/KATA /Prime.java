import java.util.Scanner;

    public class Prime{
    
    public static void main(String[]args ){
    
    Scanner dish = new Scanner(System.in);
    
    System.out.print("Eneter a number");
    int num = dish.nextInt();
    
    boolean Prime = true;
    if (num < 2){
        Prime = false;
    
    }else {
        for (int role = 2; role <= Math.sqrt(num); role++){
        if (num % role == 0){
            Prime = false;
            break;
            }
        }
    }
    System.out.println("Primenumber: " + Prime);
    }
    
    }
