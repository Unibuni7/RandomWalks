/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flasker;

/**
 *
 * @author slmns
 */
public class Bottle_Counter {

    public int A = 0;
    public int B = 0;
    public int C = 0;
    public int Aprice = 0;
    public double Bprice = 0;
    public int Cprice = 0;
    public double total = 0;

    public int counterA() {
        A = A + 1;

        return A;
    }

    public int counterB() {
        B = B + 1;

        return B;
    }

    public int counterC() {
        C = C + 1;

        return C;
    }

    public int priceA() {
        Aprice = Aprice + 1;

        return Aprice;
    }

    public double priceB() {
        Bprice = Bprice + 1.5;

        return Bprice;
    }

    public int priceC() {
        Cprice = Cprice + 3;

        return Cprice;
    }

    public double total() {
        total = Aprice + Bprice + Cprice;

        return total;
    }
}
