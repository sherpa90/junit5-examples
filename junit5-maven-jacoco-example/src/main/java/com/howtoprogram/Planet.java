package com.howtoprogram;

public class Planet {
    private String name;
    private double mass; // In kilograms
    private double radius; // In meters

    public Planet(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateGravity() {
        final double G = 6.67430e-11; // Gravitational constant in m^3 kg^-1 s^-2
        return (G * mass) / (radius * radius);
    }
}