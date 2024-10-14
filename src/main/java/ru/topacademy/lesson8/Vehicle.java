package ru.topacademy.lesson8;

public class Vehicle {
    String mark;
    String model;
    int year;

    public Vehicle(String mark, String model, int year) {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    public String getDescription() {
        return "Марка: " + mark
                + ", Модель: " + model
                + ", Год: " + year;
    }
}
