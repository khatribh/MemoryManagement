/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Riddhi
 */
public class Node {
    private int id;
    private static int count=0;
    private String data;
    private double available_memory;
    private boolean availability;
    Node next;
    public Node(){
      availability=true;
      next=null;
      ++count;
      id=count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public double getAvailable_memory() {
        return available_memory;
    }

    public void setAvailable_memory(double available_memory) {
        this.available_memory = available_memory;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
