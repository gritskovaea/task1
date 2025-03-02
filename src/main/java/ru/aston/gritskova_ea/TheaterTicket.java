package ru.aston.gritskova_ea;

public class TheaterTicket extends TicketService {

    public TheaterTicket(double basePrice, User user) {
        super(basePrice, user, "Theater Ticket");
    }

    @Override
    public double calculateDiscount() {
        if (user.getAge() < 12) {
            return basePrice * 0.2;
        }
        return 0;
    }
}