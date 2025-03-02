package ru.aston.gritskova_ea;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(17, "User", "2");
        User user2 = new User(70, "User", "3");
        User user3 = new User(10, "User", "1");

        OrderManager orderManager = new OrderManager();

        orderManager.addOrder(new MovieTicket(100, user1));
        orderManager.addOrder(new TheaterTicket(150, user2));
        orderManager.addOrder(new TheaterTicket(120, user3));

        System.out.println("Total Price: " + orderManager.calculateTotalPrice());

        List<TicketService> sortedOrders = orderManager.getSortedOrders();
        System.out.println("Sorted Orders by User Surname:");
        for (TicketService order : sortedOrders) {
            System.out.println(order.serviceName + " for " + order.user.getName() + " " + order.user.getSurname() +
                    " - Final Price: " + order.getFinalPrice());
        }
    }
}