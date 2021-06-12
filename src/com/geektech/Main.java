package com.geektech;

public class Main {

    public static void main(String[] args) {
        // write your code here

        createObject("Avto");
        System.out.println("_________________");
        createObject("Plane");
        System.out.println("_________________");
        createObject("Train");


    }

    public static Transport createObject(String className) {
        switch (className) {
            case "Avto":
                Avto avto = new Avto(2018, "Черный", "Бензин", 3.0, 500000);
                avto.print();

                return avto;

            case "Plane":
                Plane plane = new Plane(2015, "Белый", "Керасин", 280);
                plane.print();

                return plane;

            case "Train":
                Train train = new Train(2016, "Красный", "Дизель", 24);
                train.print();

                return train;


        }

        return null;
    }
}


