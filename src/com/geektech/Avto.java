package com.geektech;


public class Avto extends Transport implements Printablee{

    private double volume;
     private int price;

    public Avto(int yaer, String color, String fuel, double volume, int price) {
        super(yaer, color, fuel);
        this.volume = volume;
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Год выпуска:"+ getYaer() + " Цвет: " + getColor() + " Тип топлива: " + getFuel() +
                " Обьем машины: " + getVolume() + " Цена: " + getPrice());
    }
}
