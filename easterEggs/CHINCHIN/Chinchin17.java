import java.util.Scanner;
public class Chinchin17 {
                public static void main (String[] args) {
                Scanner apple = new Scanner(System.in);

//                      User instructions
                        System.out.println(" enter the opposite value.");
                        int oppVal = apple.nextInt();
                        System.out.println("enter the adjacent value.");
                        int adjVal = apple.nextInt();

//                      hypotenus formular is Asq+Bsq=Csq
                         int hypCalc = (oppVal * oppVal) +  (adjVal *adjVal);
                         int hyp = (hypCalc*hypCalc);

                        System.out.println("Hypotenus is = " + hyp);
                }
}   
