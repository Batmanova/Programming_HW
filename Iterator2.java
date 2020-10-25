/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Iterator;

/**
 *
 * @author alisa
 */
public class Iterator2 implements Iterator<Object> {
    private Object[][] m;
    private int i, j;
    public Iterator2(Object[][] m) {
      this.m = m;
  }
  @Override
  public boolean hasNext() {
    return i < m.length && j < m[i].length;
  }
  @Override
  public Object next() {
    Object r = m[i][j++];
    if (j >= m[i].length) {
      i++;
      j = 0;
    }
    return r;
  }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}