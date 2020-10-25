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
public class WorkerFixed extends Worker {
    public int id;
    public int wage;
    public String name;
    public WorkerFixed (int id, int wage, String name) {
     this.id = id;
     this.wage = wage;
     this.name = name;
}
    @Override
    public double wage() {
        return this.wage;
    }
}
