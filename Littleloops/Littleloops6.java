import java.util.Scanner;

public class Littleloops6{

public static void main(String[]args ){
Scanner apple = new Scanner(System.in);

System.out.print("enter a number:");
int input = apple.nextInt();
int sum = 0;
for (int i = 1; i<= input; i++){
sum = sum + i;
}
System.out.print(sum);

}
}