import java.util.Scanner;

public class PizzaWahala {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of guests: ");
        int guests = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter pizza type (Sapa size / Small Money / Big boys / Odogwu): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        int slices, price;

        switch (choice) {
            case "sapa size":
                slices = 4;  price = 2500; break;
            case "small money":
                slices = 6;  price = 2900; break;
            case "big boys":
                slices = 8;  price = 4000; break;
            case "odogwu":
                slices = 12; price = 5200; break;
            default:
                System.out.println("Pizza type not found!");
                scanner.close();
                return;
        }

        int boxes    = (int) Math.ceil((double) guests / slices);
        int leftover = (boxes * slices) - guests;
        int total    = boxes * price;

        System.out.println("ORDER SUMMARY");
        System.out.println("Boxes to buy    : " + boxes);
        System.out.println("Leftover slices : " + leftover);
        System.out.println("Total price     : ₦" + total);

    }
}
