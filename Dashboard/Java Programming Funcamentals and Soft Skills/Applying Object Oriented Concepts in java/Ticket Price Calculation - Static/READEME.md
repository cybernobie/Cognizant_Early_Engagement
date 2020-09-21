# Ticket Price Calculation - Static


Create a class Ticket with the following private variables

- int ticketid;
- int price;
- static int availableTickets;

Include getters and setters methods in the Ticket class.

AvailableTickets should hold only positive value. Zero and negative values are not allowed.(This logic should be checked inside the corresponding setter method)

Write the following method in the Ticket class:

`public int calculateTicketCost(int nooftickets)` —this method should check the ticket availability, If the tickets are available, reduce the nooftickets from availableTickets and calculate the total amount as nooftickets*price  and return the total amount.  If the tickets are not available, this method should return -1.

Write a main method in the Main class to test the application.

> Sample input and output

    Enter no of bookings:
    2
    Enter the available tickets:
    25
    Enter the ticketid:
    123
    Enter the price:
    100
    Enter the no of tickets:
    5
    Available tickets: 25
    Total amount:500
    Available ticket after booking:20
    Enter the ticketid:
    124
    Enter the price:
    100
    Enter the no of tickets:
    2
    Available tickets: 20
    Total amount:200
    Available ticket after booking:18