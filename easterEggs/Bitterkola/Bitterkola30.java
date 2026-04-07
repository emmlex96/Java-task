  import java.util.Scanner;

    public class Bitterkola30{

    public static void main(String[]args ){ 

Scanner apple = new Scanner(System.in);

 System.out.print("enter number of days from today:");
    int days = apple.nextInt();

    String Weekdays = {"Monday","tuesday","wednesday","thursday","friday","Saturday","Sunday" };
    
    String result = weekdays("7 days");

    System.out.println("the result will be : " + result);

     }

}
