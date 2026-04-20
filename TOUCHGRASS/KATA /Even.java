import java.util.Scanner;

    public class Even{
    
    
    public static void main(String[]args ){
    
    Scanner joker = new Scanner(System.in);
    System.out.print("Enter a number ");
    int num = joker.nextInt();
    
    boolean isEven;
    if (num %2 == 0){
      isEven = true;
    
    }else {
    }
    System.out.println("isEven: " + isEven);
       }
    }
