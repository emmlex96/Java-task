import java.util.Scanner;
public class Chinchin5 {
            public static void main (String[] args) {
                        Scanner apple = new Scanner(System.in);

//                      User instructions
                        System.out.println("Pick a number between 0 and 1 to play this game of flipping a coin");
                        int playerNum = apple.nextInt();

//                      Generating a number between 0 and 1
                         int randomNum = (int)(Math.random() * 1);

//                      coin sides
                         String up = "Head";
                         String down = "Tail";

//                      checking player input
                        if(randomNum == 1) {
                            System.out.printf("No chosen = %d : Comp chose = %d: %s %n%n' You Won!!! %n",playerNum,randomNum,up);
                        } else if(randomNum == 0) {
                            System.out.printf("No chosen = %d : Comp chose = %d: %s %n%n' You lost!!! %n",playerNum,randomNum,down);
                        } else if (playerNum != 1 && playerNum>1 ) {
}
}
                         
            }

