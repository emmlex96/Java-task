import java.util.Scanner;

public class Bitterkola1{

public static void main(String[] args){

System.out.println("Time");

Scanner apple = new Scanner(System.in);

System.out.println("Enter Hour");
int firstHour = apple.nextInt();

System.out.println("Enter Minute");
int firstMinute = apple.nextInt();

System.out.println("Enter Hour");
int secondHour = apple.nextInt();

System.out.println("Enter Minute");
int secondMinute = apple.nextInt();

int MinuteHour = apple.nextInt();
int totalMinute = FirstHour * FirstMinute;

int totalHours = minute / 60;
int finalMinutes = totalMinute % 60;
int finalHours = FirstHours + SecondHours + carryHours;
System.out.println("Total Time: " + finalHours + "hrs" + finalMinutes + "mins");
}
}
