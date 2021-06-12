package com.geektech;

public class Plane extends Transport implements Printablee{

    private int places;

    public Plane(int yaer, String color, String fuel, int places) {
        super(yaer, color, fuel);
        this.places = places;
    }

    public int getPlaces() {
        return places;
    }

    @Override
    public void print() {
        System.out.println(" Год выпуска: " + getYaer() + " Цвет: " + getColor() + " Тип топлива: " + getFuel() +
                " Места в самолёте: " + getPlaces());
    }
}
