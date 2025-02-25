package ru.aston.gritskova_ea;

import java.util.Objects;

public class User {
    private int age;
    private String name;
    private String surname;

    public User(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, surname);
    }
}