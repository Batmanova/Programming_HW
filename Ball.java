/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author alisa
 */
public class Ball extends SolidOfRevolution {
    public double radius;
    public double volume;
    Ball (double radius) {
     this.radius = radius;
     this.volume = 4*3.14*radius*radius/3;
}
    public double getRadius() {
        return this.radius;
    }
    public double getVolume() {
        return this.volume;
    }
}
