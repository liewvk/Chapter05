import java.util.Scanner;

public class ProductReceipt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double TAX_RATE = 0.06;

        System.out.print("Enter product name: ");
        String productName = input.nextLine();

        System.out.print("Enter unit price: $ ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double subtotal = unitPrice * quantity;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        System.out.println();
        System.out.println("Product Receipt");
        System.out.println("---------------");
        System.out.println("Product : " + productName);
        System.out.printf("Unit Price: $ %.2f%n", unitPrice);
        System.out.println("Quantity  : " + quantity);
        System.out.printf("Subtotal  : $ %.2f%n", subtotal);
        System.out.printf("Tax       : $ %.2f%n", tax);
        System.out.printf("Total     : $ %.2f%n", total);

        input.close();
    }
}

