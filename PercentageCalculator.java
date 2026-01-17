import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sum of obtained marks: ");
        double obtainedMarks = sc.nextDouble();

        System.out.print("Enter the maximum marks: ");
        double maximumMarks = sc.nextDouble();

        double percentage = (obtainedMarks / maximumMarks) * 100;

        System.out.println("Percentage of marks: " + percentage + "%");
        sc.close();
    }
}
