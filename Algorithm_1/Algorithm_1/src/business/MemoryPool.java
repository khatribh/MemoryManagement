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
import business.Node;
public class MemoryPool {
    
    MemoryLL pool[]=new MemoryLL[10];
    int cFailedReq=0;
    int cFragments=0;
    public void createMemory(){
        
          for(int i=0;i<pool.length;i++){
             pool[i]=new MemoryLL();
          }
          for(int i=0;i<pool.length;i++){
            for(int j=0;j<10;j++){
          //      System.out.println("push"+i);
                Node n=new Node();
                n.setAvailable_memory(Math.pow(2.0, i));
              pool[i].push(n);
            }
          }
       }
    
    
    public void allocateMemory(int size, String data){
//       Node p=n1; //Node p=n1;
//       while(p!=null){
//         if(p.getAvailable_memory()>=required && p.isAvailability()){
//          p.setAvailable_memory(p.getAvailable_memory()-required);
//             System.out.println("Memory allocated successfully");
//          if(p.getAvailable_memory()==0)
//             p.setAvailability(false);
//           break;
//         }
//         p=p.getNext();
//       }
         boolean allocated=false; 
         int r=size,count=0;
         while(r!=1){
           r=r/2;
           ++count;
         }
         int index;
       //  for(int i=0;i<pool.length;i++){
         //   for(int j=0;j<5;j++){
       //         System.out.println("pos"+i);
               Node temp= pool[count].search(size);
          //      System.out.println("value of temp"+temp);
               index=count;
               if(temp!=null){
                 temp.setAvailability(false);
                 temp.setData(data);
                   System.out.println("memory allocated");
                   allocated=true;
               }else {
                    
                    System.out.println("Memory of the size is not available"); 
                    int prev=0;
                    for(int x=index;x<pool.length;x++){
                    //   for(j=0;j<5;j++){
                          // if(pool[i].pop()!=null)
                         Node t1=pool[x].pop();
                         if(t1==null){
                          ++prev;   
                          continue;
                         }
                    //   }
                         double cursize=t1.getAvailable_memory();
                         double noOfNodes=cursize/size;
                         //create noofnodes nodes of size size pool[i]
                         Node n=new Node();
                         n.setAvailable_memory(size);
                         n.setData(data);
                         n.setAvailability(false);
                         pool[x-prev].push(n);
                         //allocated flag
                         allocated=true;
                         cFragments++;
                         System.out.println(cFragments+"framgmentation count");
                         System.out.println("memory allocated to the data by spliting nodes");
                         for(int k=2;k<=noOfNodes;k++){
                            n=new Node();
                            n.setAvailable_memory(size);
                            n.setAvailability(true);
                            pool[x-prev].push(n);
                            
                         }
                        pool[x-prev].display();
                         break;
                    }
                 }
               if(allocated==false){
                //   int counter=1;
                int temp1=0;
                outer: for(int i=index-1;i>=0;i--){
                     //  System.out.println("for");
                     //  while(temp1<=size){
                        //     System.out.println("vhilr"+i);
                          while(!pool[i].isEmpty() && temp1<size){
                             //   System.out.println("vhile2");
                             //   System.out.println("b"+temp1);
                             temp1+=Math.pow(2.0, i); 
                          //   System.out.println("a"+temp1);
                             pool[i].pop();
                          }
                          if(temp1==size)
                          {  allocated=true;
                             System.out.println("Memory allocated by defragmentation");
                             break outer;
                          }
                      // }
                       
                       
//                       double cursize1=Math.pow(2.0, i);
//                       System.out.println("cursize"+cursize1);
//                       double no=(int)size/cursize1;
//                       System.out.println("no:"+no);
//                          int avl=pool[i].searchNo();
//                          System.out.println("avl:"+avl);
//                          if(avl>=no){
//                          while(counter<=no){
//                            pool[i].pop();
//                            counter++;
//                          }//else utilizing this available n adding from next
//                              System.out.println("Memory allocated by defragmentation");
//                          break;
//                          }
                   }
                   if(allocated==false)
                   { System.out.println("Failed request");
                       cFailedReq++;
                       System.out.println(cFailedReq+"failed request count");}
               }
        //    }
        
        //    }
         
    }
    public void displayPool(){
        for(int i=0;i<pool.length;i++){
          pool[i].display();
        }
    }
}
