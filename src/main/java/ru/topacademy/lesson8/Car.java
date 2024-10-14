package ru.topacademy.lesson8;

public class Car extends Vehicle {
    int numberOfDoors;

    public Car(int numberOfDoors, String mark, String model, int year) {
        super(mark, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Количество дверей: " + numberOfDoors;
    }
}
