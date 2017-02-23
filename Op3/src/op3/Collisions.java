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
public class Collisions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int times = 0;
        
        RandomWalk particle = new RandomWalk(100000,2000000,-3,0);
        RandomWalk particle2 = new RandomWalk(100000,2000000,3,0);
        
         for(int i=0; i<10000; i++){
             particle.takeStep();
             particle2.takeStep();
//    if(particle.getX()== particle2.getX() && particle.getY() == particle2.getY()){
//        times++;
//    }
if (samePosition(particle, particle2)){
             times++;
         }
}
         System.out.println("They have collided " + times + " times");
    }
   public static boolean samePosition(RandomWalk p1, RandomWalk p2){
       if(p1.getX()== p2.getX() && p1.getY() == p2.getY()){
           return true;
           
       }else{
           return false;
       }
   }
}
