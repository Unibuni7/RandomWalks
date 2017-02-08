/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacepro;

/**
 *
 * @author slmns
 */
public class Compare3 {
    
    
    public static Comparable Largest(String value1,String value2, String value3){
        
        
        int result = value1.compareTo(value2);
        int result2 = value2.compareTo(value3);
        int result3 = value3.compareTo(value1);
        
        if (result < result2 && result2 > result3){
            return result2;
        }
            if (result2 < result3 && result3 > result){
                return result3;
            }
            
            else{
                return result;
            }
    }
}
