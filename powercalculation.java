import java.util.Scanner;

public class powercalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the voltage (in volts): ");
        double voltage = sc.nextDouble();

        System.out.print("Enter the current (in amperes): ");
        double current = sc.nextDouble();

        double power = voltage * current;

        System.out.println("The power consumption in watts is: " + power + " W");

        sc.close();
    }
}
