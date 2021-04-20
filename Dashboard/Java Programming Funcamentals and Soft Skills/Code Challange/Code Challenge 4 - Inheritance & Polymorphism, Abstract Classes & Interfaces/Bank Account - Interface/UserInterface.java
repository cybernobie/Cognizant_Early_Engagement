import java.text.DecimalFormat;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();

        System.out.println("Enter the Account number");
        String accountNumber = scanner.next();

        System.out.println("Enter the Customer Name");
        String customerName = scanner.next();

        System.out.println("Enter the Balance amount");
        double balance = scanner.nextDouble();

        System.out.println("Enter the number of years");
        int noOfYears = scanner.nextInt();

        System.out.println("Customer Name " + customerName);
        System.out.println("Account Number " + accountNumber);
        System.out.println("Account Balance "  + decimalFormat.format(balance));

        switch (choice) {
            case 1: {
                SavingsAccount savingsAccount = new SavingsAccount(accountNumber, customerName, balance);
                System.out.println("Maintenance Charge for Savings Account is Rs " + decimalFormat.format(savingsAccount.calculateMaintenanceCharge(noOfYears)));
                break;
            }
            case 2: {
                CurrentAccount currentAccount = new CurrentAccount(accountNumber, customerName, balance);
                System.out.println("Maintenance Charge for Current Account is Rs " + decimalFormat.format(currentAccount.calculateMaintenanceCharge(noOfYears)));
            }
        }
    }
}
