import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no of bookings:");
        int bookings = scanner.nextInt();

        System.out.println("Enter the available tickets:");
        int availableTickets = scanner.nextInt();

       Ticket ticket = new Ticket();
       ticket.setAvailableTickets(availableTickets);

       for (int i = 0; i < bookings; ++i) {
           System.out.println("Enter the ticketid:");
           int ticketId = scanner.nextInt();

           System.out.println("Enter the price:");
           int price = scanner.nextInt();

           System.out.println("Enter the no of tickets:");
           int tickets = scanner.nextInt();

           ticket.setTicketid(ticketId);
           ticket.setPrice(price);

           System.out.println("Available tickets: " + ticket.getAvailableTickets());

           int cost = ticket.calculateTicketCost(tickets);
           System.out.println("Total amount:" + cost);
           System.out.println("Available ticket after booking:" + ticket.getAvailableTickets());
       }
    }
}