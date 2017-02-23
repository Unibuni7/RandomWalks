/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package op3;

import java.util.Scanner;

/**
 *
 * @author slmns
 */
public class TestWalk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        RandomWalk r = new RandomWalk(200,10);
//        r.walk();
//        System.out.println(r.toString());
        System.out.println("Enter Max and Edge");       
        Scanner scan = new Scanner(System.in);
    int edge = scan.nextInt();
    int max = scan.nextInt();
    
    RandomWalk object1 = new RandomWalk(5,10);
    RandomWalk object2 = new RandomWalk(max,edge);
        System.out.println("object 1");
        for (int i = 0; i < 5; i++){
            object1.takeStep();
            System.out.println(object1);
        }
        System.out.println("the max distance is " + object1.getMaxDistance());
                System.out.println("object 2");

     for (int i = 0; i < 5; i++){
         object2.takeStep();
             System.out.println(object2);
        }
        System.out.println("The max distance is " + object2.getMaxDistance());
       
        
    }
    
}
