/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Comparator;

/**
 *
 * @author alisa
 */
public class Sorting implements Comparator<WorkerFixed>{
    public int compare (WorkerFixed a, WorkerFixed b) {
        if (a.wage == b.wage) {
            return a.name.compareTo(b.name);
        } else {
            return a.wage-b.wage;
        }
    }
}
