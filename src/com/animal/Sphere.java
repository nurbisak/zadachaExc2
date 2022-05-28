package com.animal;

public class Sphere {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }
    public double Sphere() {

        double areaOfSphere = (4 * Math.PI * Math.pow(radius, 2));
        System.out.println(areaOfSphere);
        return areaOfSphere;
    }
    public double volSphere() {
        double volumeOfSphere = (4 / 3 * Math.PI * Math.pow(radius, 3));

        return volumeOfSphere;
    }
}

