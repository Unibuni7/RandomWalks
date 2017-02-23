/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package op3;

/**
 *
 * @author slmns
 */
public class DrunkenWalk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int Drunks = 0;
     int falls = 0;
     
     for(int i =0; i<10; i++){
         RandomWalk drunk = new RandomWalk(200,50);
         drunk.walk();
         System.out.println(drunk);
         Drunks++;
         if(!drunk.inBounds()){
             falls++;
         }
         
     }
        System.out.println("The number of drunks that fall is " + falls + " out of " + Drunks);
        // If the boundary is high, there will be less falls.
        // But if the max steps is very high compared to the boundary there will be more falls.
    }
    
}
