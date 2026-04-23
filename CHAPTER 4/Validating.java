import java.util.Scanner;
    public class Validating{
       public static void main(String[]args ){
Scanner input = new Scanner(System.in);
int result;
System.out.print("Enter 1 or 2: ");
result = input.nextInt();
while (result != 1 && result != 2) {
System.out.print("Invalid. Enter 1 or 2: ");
result = input.nextInt();
}

}
}
