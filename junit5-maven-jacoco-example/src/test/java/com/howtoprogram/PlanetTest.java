package com.howtoprogram;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class PlanetTest { 

    @Test
    void testCalculateGravity() {
        Planet earth = new Planet("Earth", 5.972e24, 6.371e6);
        double gravity = earth.calculateGravity();
        assertEquals(9.8, gravity, 0.1);
    }

    @Test
    void testGetName() {
        Planet earth = new Planet("Earth", 5.972e24, 6.371e6);
        assertEquals("Earth", earth.getName());
    }

    @Test
    void testGetMass() {
        Planet earth = new Planet("Earth", 5.972e24, 6.371e6);
        assertEquals(5.972e24, earth.getMass());
    }

    @Test
    void testGetRadius() {
        Planet earth = new Planet("Earth", 5.972e24, 6.371e6);
        assertEquals(6.371e6, earth.getRadius());
    }
}
