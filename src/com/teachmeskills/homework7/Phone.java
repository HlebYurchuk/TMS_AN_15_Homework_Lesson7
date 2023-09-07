package com.teachmeskills.homework7;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String GetNumber() {
        return this.number;
    }

    public void reciveCall(String name) {
        System.out.println("Вызывает " + name);
    }

    public void reciveCall(String name, String number) {
        System.out.println("Вывает " + number + name);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщения отправляются на следующие номера:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }
    }
