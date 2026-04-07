import java.util.Scanner; 

    public class Bitterkola8{

    public static void main(String[]args ){
        Scanner apple = new Scanner(System.in);
        System.out.print("Enter a 4-digit PIN: ");

        int pin = apple.nextInt();

    if (pin >= 1000 && pin <= 9999){
        System.out.println("valid PIN");
} else {
        System.out.print("invalid PIN");
}
   }
}

