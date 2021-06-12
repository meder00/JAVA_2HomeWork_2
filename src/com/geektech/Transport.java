package com.geektech;

public  class Transport {
    private int yaer;
    private String color;
    private String fuel;

    public Transport(int yaer, String color, String fuel) {
        this.yaer = yaer;
        this.color = color;
        this.fuel = fuel;
    }

    public int getYaer() {

        return yaer;
    }

    public void setYaer(int yaer) {

        this.yaer = yaer;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }


    public void setFuel(String fuel) {
        this.fuel = fuel;
    }


}
