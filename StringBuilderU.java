/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author alisa
 */
public class StringBuilderU {
    ArrayList<Subscriber> subscribers;
    private StringBuilder mains;
    private StringBuilder backup;
    
    public StringBuilderU (StringBuilder s) {
        this.mains = s;
        StringBuilder b = new StringBuilder("");
        this.backup = b;
        subscribers = new ArrayList<Subscriber>();
        this.subscribers = subscribers;
    }
    
    public void undo() {
        mains = backup;
    }
    public void append(Object o) {
        backup = mains;
        mains.append(o);
    }
    public int capacity() {
        return mains.capacity();
    }
    public void delete(int start, int end) {
        backup = mains;
        mains.delete(start, end);
    }
    public int indexOf (String s) {
        backup = mains;
        return mains.indexOf(s);
    }
    public void insert(int index, Object o) {
        backup = mains;
        mains.insert(index, o);
    }
    public int lastIndexOf(String s) {
        backup = mains;
        return mains.lastIndexOf(s);
    }
    public int length() {
        backup = mains;
        return mains.length();
    }
    public void replace(int start, int end, String str) {
        backup = mains;
        mains.replace(start, end, str);
    }
    public void reverse() {
        backup = mains;
        mains.reverse();
    }
    public String substring(int start, int end) {
        backup = mains;
        return mains.substring(start, end);
    } 
    public String toString() {
        backup = mains;
        return mains.toString();
    }
    
    public void notified () {
        for (int i = 0; i < subscribers.size(); i++) {
            subscribers.get(i).changedTime = new Date();
        }
    }
    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
    }
    public void removeSubscribers(Subscriber s) {
        subscribers.remove(s);
    }
}
