import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CheckOutApp {
    static final double DISCOUNT_RATE = 0.08;
    static final double VAT_RATE = 0.175;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter cashier name: ");
        String cashierName = scanner.nextLine();
        
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        
        System.out.print("How many items does the customer have? ");
        int itemCount = scanner.nextInt();
        scanner.nextLine();
        
        String[] names= new String[itemCount];
        double[] prices = new double[itemCount];
        int[]quantities = new int[itemCount];
            
        for (int product = 0; product < itemCount; product++) {
            System.out.print("Enter product name: ");
            names[product] = scanner.nextLine();
            
            System.out.print("Enter price: ");
            prices[product] = scanner.nextDouble();
            
            System.out.print("Enter quantity: ");
            quantities[product] = scanner.nextInt();
            scanner.nextLine();
    }
    
    System.out.print("How much did the customer give to you? ");
    double amountPaid = scanner.nextDouble();
    double subTotal= calculateSubTotal(prices, quantities);
    double discount= calculateDiscount(subTotal);
    double vat= calculateVAT(subTotal);
    double billTotal = calculateBillTotal(subTotal, discount, vat);
    double balance = calculateBalance(amountPaid, billTotal);
    
    printReceipt(cashierName, customerName, names, prices, quantities,
        subTotal, discount, vat, billTotal, amountPaid, balance);
        
    scanner.close();
    }

    public static double calculateSubTotal(double[] prices, int[] quantities) {
    double total = 0;
    for (int product = 0; product < prices.length; product++) {
        total += prices[product] * quantities[product];
    }
    return total;
}
public static double calculateDiscount(double subTotal) {
    return subTotal * DISCOUNT_RATE;
}
public static double calculateVAT(double subTotal) {
    return subTotal * VAT_RATE;
}
public static double calculateBillTotal(double subTotal, double discount, double vat) {
    return subTotal - discount + vat;
}
public static double calculateBalance(double amountPaid, double billTotal) {
    return amountPaid - billTotal;
}

public static void printReceipt(
        String cashierName, String customerName,
        String[] names, double[] prices, int[] quantities,
        double subTotal, double discount, double vat,
        double billTotal, double amountPaid, double balance) {
        
    String date = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("d-MMM-yy h:mm:ss a"));
    String line = "=".repeat(52);
    String dashes = "-".repeat(52);
    
    System.out.println(line);
    System.out.println("SEMICOLON STORES");
    System.out.println("MAIN BRANCH");
    System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
    System.out.println("TEL: 03293828343");
    System.out.println("Date : " + date);
    System.out.println("Cashier: " + cashierName);
    System.out.println("Customer Name: " + customerName);
    System.out.println(line);
    
    System.out.printf("%-20s %5s %10s %12s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
    System.out.println(dashes);
    
    for (int product = 0; product < names.length; product++) {
        double lineTotal = prices[product] * quantities[product];
        System.out.printf("%-20s %5d %10.2f %12.2f%n",
            names[product], quantities[product], prices[product], lineTotal);
    }
    System.out.println(dashes);
    System.out.printf("%35s %12.2f%n", "Sub Total:", subTotal);
    System.out.printf("%35s %12.2f%n", "Discount:", discount);
    System.out.printf("%35s %12.2f%n", "VAT @ 17.50%:", vat);
    System.out.println(line);
    System.out.printf("%35s %12.2f%n", "Bill Total:", billTotal);
    System.out.printf("%35s %12.2f%n", "Amount Paid:", amountPaid);
    System.out.printf("%35s %12.2f%n", "Balance:", balance);
    System.out.println(line);
    System.out.printf("%36s%n", "THANK YOU FOR YOUR PATRONAGE");
    System.out.println(line);
    
    
    }
  }
