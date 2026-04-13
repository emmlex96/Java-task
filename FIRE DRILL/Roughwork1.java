import java.util.Scanner;

public class Roughwork1 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.print("Enter A 5 Digit Number: ");
  int number = input.nextInt();

  int firstNumber = number / 10000;
  int secondNumber = number % 10;
  
  int sum = firstNumber + secondNumber;
  int firstDigit = firstNumber;
  int secondDigit = secondNumber;

  System.out.println("First Number: "+ firstDigit);
  System.out.println("Second Number: "+ secondDigit);
  System.out.println("The sum of "+ firstNumber +" and the "+ secondNumber + " is "+ sum);
  }
}
