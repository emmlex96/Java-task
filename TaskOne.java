import java.util.Scanner;
    public class TaskOne{
    public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
int Total = 0;
int count = 1;
while (count <= 10){
System.out.print("Enter score ");
int score = inputCollector.nextInt();
Total =Total + score ;
count++;
}
System.out.println("the sum of score is :" + Total);
}
}
