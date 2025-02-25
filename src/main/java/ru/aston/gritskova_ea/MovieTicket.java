package ru.aston.gritskova_ea;

public class MovieTicket extends TicketService {

    public MovieTicket(double basePrice, User user) {
        super(basePrice, user, "Movie Ticket");
    }

    @Override
    public double calculateDiscount() {
        if (user.getAge() < 18) {
            return basePrice * 0.1; // 10% скидка для молодежи
        } else if (user.getAge() > 65) {
            return basePrice * 0.15; // 15% скидка для пенсионеров
        }
        return 0;
    }
}