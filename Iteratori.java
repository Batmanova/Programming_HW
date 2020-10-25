/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author alisa
 */
public class Iteratori implements Iterator<Object> {
   private Stack<Iterator> iterators;
    private String next;
    private boolean hasNext;
    public Iteratori(Iterator<?> iterator1, Iterator<?> iterator2){
        this.iterators = new Stack<Iterator>();
        this.iterators.push(iterator1);
        this.iterators.push(iterator2);

        next();
    }
  @Override
  public boolean hasNext() {
    return i < m.length && j < m[i].length;
  }
  @Override
  public Object next() {
    if(iterators.empty()){
            next = null;
            hasNext = false;
            return;
        }

        Iterator current = iterators.peek();

        if(current.hasNext()){
            Object o = current.next();
            if(o instanceof Object){
                next = (String) o;
                hasNext = true;
            }else if(o instanceof Iterator){
                Iterator iterator = (Iterator) o;
                iterators.push(iterator);
                next();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            iterators.pop();
            next();
        }
  }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
