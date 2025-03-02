package ru.aston.gritskova_ea;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicketServiceTest {

    @Test
    public void testUserCreation() {
        User user = new User(30, "User", "1");
        assertEquals(30, user.getAge());
        assertEquals("User", user.getName());
        assertEquals("1", user.getSurname());
    }

    @Test
    public void testTheaterTicketDiscountForChild() {
        User childUser = new User(10, "User", "2");
        TheaterTicket ticket = new TheaterTicket(100, childUser);
        assertEquals(20.0, ticket.calculateDiscount(), 0.01);
    }

    @Test
    public void testMovieTicketDiscountForStudent() {
        User studentUser = new User(20, "User", "3");
        MovieTicket ticket = new MovieTicket(100, studentUser);
        assertEquals(0.0, ticket.calculateDiscount(), 0.01);
    }

    @Test
    public void testMovieTicketDiscountForSenior() {
        User seniorUser = new User(70, "User", "4");
        MovieTicket ticket = new MovieTicket(100, seniorUser);
        assertEquals(15.0, ticket.calculateDiscount(), 0.01);
    }
}

