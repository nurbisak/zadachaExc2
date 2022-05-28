package com.animal;

public class Paralleliped {
    private int lenght;
    private int width;
    private int hight;

    public Paralleliped(int lenght, int width, int hight) {
        this.lenght = lenght;
        this.width = width;
        this.hight = hight;
    }



    public int Paralleliped() {

        int areOfParalleliped = 2 * (hight * lenght) + (lenght * width) + (hight * width);
        System.out.println("area of Paralleliped: " + areOfParalleliped);
        return areOfParalleliped;
    }

    public int volume() {
        int volumeOfParalleliped = (lenght + hight + width);
        System.out.println("volume of Paralleliped: " + volumeOfParalleliped);
        return volumeOfParalleliped;
    }

}