package ru.aston.gritskova_ea;

import java.util.Objects;

public abstract class TicketService {
    protected double basePrice;
    protected User user;
    protected String serviceName;

    public TicketService(double basePrice, User user, String serviceName) {
        this.basePrice = basePrice;
        this.user = user;
        this.serviceName = serviceName;
    }

    public abstract double calculateDiscount();

    public double getFinalPrice() {
        return basePrice - calculateDiscount();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TicketService)) return false;
        TicketService that = (TicketService) o;
        return Double.compare(that.basePrice, basePrice) == 0 &&
                Objects.equals(user, that.user) &&
                Objects.equals(serviceName, that.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basePrice, user, serviceName);
    }
}