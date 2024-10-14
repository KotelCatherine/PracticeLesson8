package ru.topacademy.lesson8;

public class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(boolean hasSidecar, String mark, String model, int year) {
        super(mark, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Наличие коляски: " + hasSidecar;
    }
}
