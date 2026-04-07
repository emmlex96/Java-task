import java.util.Scanner; 

    public class Bitterkola15{

    public static void main(String[]args ){
        Scanner apple = new Scanner(System.in);
        System.out.print("enter a number: ");

    double num = apple.nextDouble();

    if (num > 10 && num < 100){
        System.out.println(num + "is between 10 and 100");
}   else  {
        System.out.println(num + "is not between 10 ans 100");
     }

  }
}
