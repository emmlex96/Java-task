import java.util.Scanner;

public class Littleloops5{
public static void main(String[]args ){
	Scanner userCollector = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int userInput = userCollector.nextInt();

	for(int i = 1;i <= userInput; i++) System.out.println(i);
}
}