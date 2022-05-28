package com.animal;

import static java.lang.Math.PI;

public class Shape {
    private double baseRadius1;
    private double hight1;

    public Shape(double baseRadius, double hight) {
        this.baseRadius1 = baseRadius;
        this.hight1 = hight;
    }

    public double Shape(){
        double areaOfShape=PI*Math.pow(baseRadius1,2);
        System.out.println(areaOfShape);
        return areaOfShape;

    }public double VolShape(){
     double volShape= (hight1/3)*PI*Math.pow(baseRadius1,2);
        System.out.println(volShape);
     return volShape;

}
    }