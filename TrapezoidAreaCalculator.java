import java.util.Scanner;

public class TrapezoidAreaCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the first parallel side (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter the length of the second parallel side (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter the height (h): ");
        double h = sc.nextDouble();

        double area = h * (a + b) / 2;
        System.out.println("The area of the trapezoid is: " + area);

        sc.close();
    }
}

