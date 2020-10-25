/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

/**
 *
 * @author alisa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<WorkerFixed> list = new ArrayList<WorkerFixed>();
      try
        {
            FileReader fr = new FileReader("x.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line !=null){
                 list.add(WorkerFixed(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), reader.readLine()));
            } 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }   
      Collections.sort(list, new Sorting());
       try(FileWriter writer = new FileWriter("x.txt", false))
        {
           for (int i = 0; i < list.size(); i++) {
          writer.write(list.get(i).id);
          writer.write(list.get(i).name);
          writer.write(list.get(i).wage);
      }
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
      
    }
    
}
