import java.util.*;
import java.text.*;

class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no of ticket");
        double tickets = scanner.nextDouble();

        if (tickets < 5 || tickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            System.exit(0);
        }

        System.out.println("Do you want refreshment:");
        boolean needRefreshment = scanner.next().charAt(0) == 'y';

        System.out.println("Do you have coupon code:");
        boolean haveCoupon = scanner.next().charAt(0) == 'y';

        System.out.println("Enter the circle:");
        char circle = scanner.next().charAt(0);

        if (circle != 'k' && circle != 'q') {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        double ticketCost;

        if (circle == 'k') {
            ticketCost = tickets * 75.0;
        } else {
            ticketCost = tickets * 150.0;
        }

        double totalCost = ticketCost;

        if (tickets > 20) {
            double discount = totalCost * 10 / 100;
            totalCost -= discount;
        }

        if (haveCoupon) {
            double discount = totalCost * 2 / 100;
            totalCost -= discount;
        }

        if (needRefreshment) {
            totalCost += tickets * 50.0;
        }

        System.out.println("Ticket cost:" + new DecimalFormat("0.00").format(totalCost));
    }
}