import java.util.Scanner;
public class FreezingPoint {
        public static void main (String[] args) {

        Scanner apple = new Scanner(System.in);

//      User instructions
        System.out.println("Give me a temperature value.");
        int tempVal = apple.nextInt();

        if(tempVal < 0) {
        System.out.printf("It is freezing at %d degrees %n", tempVal);

          } else if (tempVal >= 0 && tempVal <= 15 ) {
    System.out.printf("It is cold at %d degrees %n", tempVal);

          } else if (tempVal >= 15 && tempVal <= 25 ) {
    System.out.printf("It is warm at %d degrees %n", tempVal);

                        } else if (tempVal > 25 ) {
    System.out.printf("It is hot at %d degrees %n", tempVal);
                        }
               }
}
