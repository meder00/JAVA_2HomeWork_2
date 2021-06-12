package com.geektech;

public class Train extends Transport implements Printablee{

     private int wagons;

     public Train(int yaer, String color, String fuel, int wagons) {
          super(yaer, color, fuel);
          this.wagons = wagons;
     }

     public int getWagons() {
          return wagons;
     }


     @Override
     public void print() {
          System.out.println("Год выпуска: " + getYaer() + " Цвет: " + getColor() + " Тип топлива: " + getFuel() +
                  " Вагоны: " + getWagons());
     }
}
