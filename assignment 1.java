import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the length of side c: ");
        double c = sc.nextDouble();

        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area of the triangle is: " + area);

        sc.close();
    }
}

