import java.util.Scanner;
public class Hotdog29{
public static void main(String[] args){
Scanner apple = new Scanner(System.in);
System.out.print("Enter your score:");
int score = apple.nextInt();
if(score >= 90 && score <= 100){
System.out.println("Grade A%n");
}
else if( score >= 80 && score <= 89){
System.out.println("Grade B%n");
}
else if( score >=70 && score <= 79){
System.out.println("Grade C%n");
}
else if( score >= 60 && score <= 69){
System.out.println("Grade D%n");
}
else if( score <= 60){
System.out.printf("Grade F%n");
    }
}
}
