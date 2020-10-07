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
public class Cylinder extends SolidOfRevolution {
    public double radius;
    public double height;
    public double volume;
    Cylinder (double radius, double height) {
     this.radius = radius;
     this.height = height;
     this.volume = radius*radius*height*3.14;
}
    public double getRadius() {
        return this.radius;
    }
    public double getVolume() {
        return this.volume;
    }
}
