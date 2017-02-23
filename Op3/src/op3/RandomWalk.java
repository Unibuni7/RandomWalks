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
public class RandomWalk {

    private int x;
    private int y;
    public int max;
    public int steps;
    public int edge;
    public int maxDistance;

    public RandomWalk(int max, int edge) {
        this.max = max;
        this.edge = edge;
        x = 0;
        y = 0;
        steps = 0;
        maxDistance = 0;
    }

    public RandomWalk(int max, int edge, int x, int y) {
        this.max = max;
        this.edge = edge;
        this.x = x;
        this.y = y;
        maxDistance = 0;
    }

    public void takeStep() {
        int step = (int) (Math.random() * 4);

        switch (step) {
            case 0:
                System.out.println("You went up");
                this.y++;
                steps++;
                break;
            case 1:
                System.out.println("You went down");
                this.y--;
                steps++;
                break;
            case 2:
                System.out.println("You went left");
                this.x--;
                steps++;
                break;
            case 3:
                System.out.println("You went right");
                this.x++;
                steps++;
                break;

        }
        maxDistance= max(maxDistance,max(x,y));
    }

    public boolean moreSteps() {
        if (steps < max) {
            return true;
        } else {

            return false;
        }
    }

    public boolean inBounds() {
        if (this.x < edge && this.y < edge) {
            return true;
        } else {
            return false;
        }
    }
    
    public void walk(){
        while(moreSteps() && inBounds()){
            takeStep();
        }
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public int max(int num1,int num2){
         if(Math.abs(num1) >= Math.abs(num2)){
          return  num1;
        }else {
             return num2;
         }
    }
    
    public int getMaxDistance(){
        return maxDistance;
    }

    @Override
    public String toString() {
        return "Steps: " + steps + " Position: (" + this.x + "," + this.y + ")";
    }

}
