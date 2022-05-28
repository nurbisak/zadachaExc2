package com.animal;

import static java.lang.Math.PI;

public class Cylinder {
    private double baseRadius;
    private double hight;

    public Cylinder(double baseRadius, double hight) {
        this.baseRadius = baseRadius;
        this.hight = hight;
    }
    public double Cylinder(){
        double areaOfCylinder = 4 / 3 * PI * Math.pow(baseRadius, 3);
        System.out.println(areaOfCylinder);
        return areaOfCylinder;
    }
    public double VolCylinder(){
        double volcylinder=PI*baseRadius*baseRadius*hight;
        System.out.println(volcylinder);
        return volcylinder;
    }
}
