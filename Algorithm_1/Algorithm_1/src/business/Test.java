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
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Apurva Sawant
 */
public class Test {

    public static void main(String[] args) {

        MemoryPool mp = new MemoryPool();
        System.out.println("memory.Test.main()");
        mp.createMemory();

        Random rand = new Random();

        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
        int size = array[rand.nextInt(array.length)];

        String[] dataArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "ab", "bc", "cd"};
        String data = dataArray[rand.nextInt(array.length)];

//        for(int i=0;i<5;i++){
//           mp.allocateMemory(512, data);
//           mp.allocateMemory(256, data);
//        }
//        mp.allocateMemory(128, data);
//        mp.allocateMemory(128, data);
//        mp.allocateMemory(512, data);
        //   mp.allocateMemory(64, data);
//        for(int i=0;i<5;i++){
//           mp.allocateMemory(64, data);
//        }
//        for(int i=0;i<5;i++){
//           mp.allocateMemory(128, data);
//        }
//        mp.allocateMemory(64, data);
//        mp.allocateMemory(64, data);
//
mp.displayPool();
        StopWatch s = new StopWatch();
         s.start();


        for(int i=0;i<10000;i++){
               mp.allocateMemory(size, data);
        }
        s.stop();
        System.out.println("elapsed time in milliseconds: " + s.getElapsedTime());
//       // System.out.println("avail: "+mp.calc());
//        do{
//        System.out.println("Enter the amount of memory:");
//        Scanner reader = new Scanner(System.in); 
//        int memory=reader.nextInt();
//        mp.allocateMemory(memory);
//        System.out.println("avail: "+mp.calc());
//        System.out.println("Do you want to continue? Y/N");
//        char flag = reader.next().charAt(0);
//                if(flag == 'N'){
//                 System.out.println("Thank You");
//                 break;
//        
//                }
//        }while(true);
    }
}
