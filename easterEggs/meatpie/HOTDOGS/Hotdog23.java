import java.util.Scanner;
public class Hotdog23{
public static void main(String[] args){
Scanner apple = new Scanner(System.in);
System.out.print("Enter weight of 1st package :");
double weight1 = apple.nextDouble();
System.out.print("Enter price of 1st package:");
double price1 = apple.nextDouble();
System.out.print("Enter weight of 2nd package :");
double weight2 = apple.nextDouble();
System.out.print("Enter price of 2nd package:");
double price2 = apple.nextDouble();
if (price1 < price2){
System.out.println (" 1st package has the better price per unit weight.");
}
else if (price2 < price1){
System.out.println (" 2nd package has the better price per unit weight.");
}
else {
System.out.println(" Both packaginghave the same price per unit weight.");
}
}
}
