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
public class InterfacePro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Compare3 com = new Compare3();
        String value1 = "Hello";
        String value2 = "Darkness";
        String value3 = "My old friend";
        
        Comparable Largest = Compare3.Largest(value1, value2, value3);
        System.out.println(Largest);
        
    }
    
}
