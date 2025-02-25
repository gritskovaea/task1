package ru.aston.gritskova_ea;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderManager {
    private List<TicketService> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(TicketService order) {
        orders.add(order);
    }

    public double calculateTotalPrice() {
        return orders.stream()
                .mapToDouble(TicketService::getFinalPrice)
                .sum();
    }

    public List<TicketService> getSortedOrders() {
        return orders.stream()
                .sorted(Comparator.comparing(o -> o.user.getSurname()))
                .collect(Collectors.toList());
    }
}