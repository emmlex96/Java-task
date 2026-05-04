import java.util.Scanner; 
public class TaskOne{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] scores = new int[10];

        System.out.println("Enter 10 scores:");

        for (int count= 0; count < scores.length; count++) {
            System.out.print("Score " + (count+ 1) + ": ");
            scores[count] = input.nextInt();
        }

        System.out.println("Scores stored in array:");

        for (int count = 0; count < scores.length; count++) {
            System.out.print(scores[count] + " ");
        }
    }
}
