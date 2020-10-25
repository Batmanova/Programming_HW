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
public class WorkerHour extends Worker{
    public int rate;
    public WorkerHour (int rate) {
        this.rate = rate;
    }
    
    @Override
    public double wage() {
        return this.rate*20.8*8;
    }
}
