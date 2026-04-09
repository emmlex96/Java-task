import java.util.Scanner;

public class Littleloops7{

public static void main(String[]args ){
Scanner apple = new Scanner(System.in);

System.out.println("enter a number:");
int input = apple.nextInt();

for (int i = input; i>= 1;i--){
System.out.println(i);
}

}
}