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
public class Pyramid extends Shape {
    public double s;
    public double h;
    public double volume;
    Pyramid (double s, double h) {
        this.s = s;
        this.h = h;
        this.volume = s*h/3;
    }
    public double getVolume() {
        return this.volume;
    }
}
