import java.util.*;
import java.text.*;

class Main {
    private static void calculateFuelConsumption(double liter, double km) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double gallon = liter * 0.2642;
        double mile = km * 0.6214;

        double literPerKm = (liter / km) * 100;
        double gallonPerKm = mile / gallon;

        System.out.println("Liters/100KM");
        System.out.println(decimalFormat.format(literPerKm));
        System.out.println("Miles/gallons");
        System.out.println(decimalFormat.format(gallonPerKm));
    }

    private static void test(double value) {
        if (value <= 0) {
            System.out.println((int) value + " is an Invalid Input");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        double liter = scanner.nextDouble();
        test(liter);
        System.out.println("Enter the distance covered");
        double km = scanner.nextDouble();
        test(km);
        calculateFuelConsumption(liter, km);
    }
}