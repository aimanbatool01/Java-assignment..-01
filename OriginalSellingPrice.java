import java.util.Scanner;

public class OriginalSellingPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the discounted selling price: ");
        double discountedPrice = sc.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = sc.nextDouble();

        double originalPrice = discountedPrice / (1 - discountPercentage / 100);

        System.out.println("The original selling price is: " + originalPrice);

        sc.close();
    }
}

