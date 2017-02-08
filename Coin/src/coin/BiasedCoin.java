/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coin;
import java.util.Random;
/**
 *
 * @author slmns
 */
public class BiasedCoin{
    private double bias;

    public BiasedCoin(double bias) {
        bias = 0.5;
    }
    
    public double Bias(){
     if (bias<1 || bias>0){
         return bias;
     }   else {
    
   return 0.5;
    
}
    }
}