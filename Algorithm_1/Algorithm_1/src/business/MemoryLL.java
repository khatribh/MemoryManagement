/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author Riddhi
 */public class MemoryLL {
    Node first=null;
    Node p=null;
    public void push(Node n){
        p=first;
       if(first==null)
       {
           first=n; //System.out.println("first");
       }
       else{
         while(p!=null)
         {
           //  System.out.println("2nd ele");
           if(p.getNext()==null)
           {p.setNext(n);
            break;
           }
           p=p.getNext();
         }
       }
    }
    public boolean isEmpty(){
        Node p=first;
    
         if(first==null){
            return true;
         }else{
             while(p!=null)
          {
             if(p.isAvailability()==true){
                 return false;
             }
             p=p.getNext();
           }
         }
         return true;        
    }
    
    public Node pop(){
//        Node temp = first;
//        p=first;
//       if(first.getId()==id)
//           first=first.getNext();
//       else{
//          while(p!=null)
//         {
//           if(p.getId()==id){
//             temp.getNext()=p.getNext();
//           }
//             
//               temp=p;
//           p=p.getNext();
//         }
//       }
      
      Node temp=first;//prev
      if(first==null)
            return null;
      else if(first.getNext()==null){
            if(first.isAvailability()==true)
                first=first.getNext();
            else 
                return null;
      }
      else if(first.isAvailability()==true)
                 first=first.getNext();
      else {
          p=first.getNext();//curr
          while(p!=null)
          {
             if(p.isAvailability()==true){
                // Node n=p.getNext();
                 temp.setNext(p.getNext());
                 break;
             }
                temp=temp.getNext();
                p=p.getNext();
         }
         }
      return p;
    }
    public void display(){
      Node p=first;
      System.out.println("Memory Block is");
      while(p!=null)
          {
              System.out.println("Size:"+p.getAvailable_memory()+"Availability:"+p.isAvailability());
             // System.out.println();
             // System.out.println("--------------------------");
              p=p.getNext();
          }
    }
    public Node search(int size){
      Node p=first;
      while(p!=null)
          {
              //System.out.println("avail"+p.isAvailability());
             // System.out.println("size"+p.getAvailable_memory());
                
              if(p.isAvailability() && p.getAvailable_memory()==size)
              {   return p;}
              p=p.getNext();
          }
      return null;
    }
public int searchNo(){
      Node p=first;
      int c=0;
      while(p!=null)
          {
//              System.out.println("avail"+p.isAvailability());
//              System.out.println("size"+p.getAvailable_memory());
                
              if(p.isAvailability() )
              {  c++;}
              p=p.getNext();
          }
      return c;
    }
    
    public int calc(){
     
       Node p=first;
       int sum=0;
       while(p!=null){
           sum+=p.getAvailable_memory();
           p=p.getNext();
       }
       return sum;
    }
}
