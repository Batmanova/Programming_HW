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
public class Box extends Shape{
    public double volume;
    Box (double volume) {
        this.volume = volume;
    }
    public double getVolume() {
        return this.volume;
    }
    public boolean add (Shape s) {
        if (s.volume > volume) {
            return false;
        }
        else {
            volume -= s.volume;
            return true;
        }
    }
}
