 import java.util.Scanner;
public class Hotdog3 {
public static void main (String[] args) {
Scanner apple = new Scanner(System.in);
System.out.println("What is the length of the prism?");
int length = apple.nextInt(); 
System.out.println("What is the base of the prism?");
int base = apple.nextInt(); 
float calcBaseArea = 0.5f * length * base;
float calVol = calcBaseArea * length;
System.out.printf("The volume of your prism therefore is %f %n%n",calVol);  
                }
}


//                  base area formula = 1/2bh
//                  vol of prism = area * length
