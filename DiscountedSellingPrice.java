import java.util.Scanner;

public class DiscountedSellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original selling price: ");
        double originalPrice = sc.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = sc.nextDouble();

        double discountAmount = (originalPrice * discountPercentage) / 100;

        double discountedPrice = originalPrice - discountAmount;

        System.out.println("The discounted selling price is: " + discountedPrice);

        sc.close();
    }
}

