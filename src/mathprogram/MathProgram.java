/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathprogram;

import data.IntegerNumber;

/**
 *
 * @author julie
 */
public class MathProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntegerNumber number = new IntegerNumber(5);
        System.out.println(number.isPrimeNumber());
    }
    
}
