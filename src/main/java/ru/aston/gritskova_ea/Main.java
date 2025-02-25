package ru.aston.gritskova_ea;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем пользователей
        User user1 = new User(17, "John", "Doe");
        User user2 = new User(70, "Jane", "Smith");
        User user3 = new User(10, "Alice", "Johnson");

        // Создаем менеджер заказов
        OrderManager orderManager = new OrderManager();

        // Добавляем заказы
        orderManager.addOrder(new MovieTicket(100, user1));
        orderManager.addOrder(new TheaterTicket(150, user2));
        orderManager.addOrder(new TheaterTicket(120, user3));

        // Выводим общую стоимость всех заказов
        System.out.println("Total Price: " + orderManager.calculateTotalPrice());

        // Получаем и выводим отсортированный список заказов по фамилии пользователя
        List<TicketService> sortedOrders = orderManager.getSortedOrders();
        System.out.println("Sorted Orders by User Surname:");
        for (TicketService order : sortedOrders) {
            System.out.println(order.serviceName + " for " + order.user.getName() + " " + order.user.getSurname() +
                    " - Final Price: " + order.getFinalPrice());
        }
    }
}