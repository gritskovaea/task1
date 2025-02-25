package ru.aston.gritskova_ea;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicketServiceTest {

    @Test
    public void testUserCreation() {
        User user = new User(30, "John", "Doe");
        assertEquals(30, user.getAge());
        assertEquals("John", user.getName());
        assertEquals("Doe", user.getSurname());
    }

    @Test
    public void testTheaterTicketDiscountForChild() {
        User childUser = new User(10, "Tom", "Hanks");
        TheaterTicket ticket = new TheaterTicket(100, childUser);
        assertEquals(20.0, ticket.calculateDiscount(), 0.01); // 20% скидка
    }

    @Test
    public void testMovieTicketDiscountForStudent() {
        User studentUser = new User(20, "Alice", "Smith");
        MovieTicket ticket = new MovieTicket(100, studentUser);
        assertEquals(0.0, ticket.calculateDiscount(), 0.01); // 10% скидка
    }

    @Test
    public void testMovieTicketDiscountForSenior() {
        User seniorUser = new User(70, "John", "Doe");
        MovieTicket ticket = new MovieTicket(100, seniorUser);
        assertEquals(15.0, ticket.calculateDiscount(), 0.01); // 15% скидка
    }
}

