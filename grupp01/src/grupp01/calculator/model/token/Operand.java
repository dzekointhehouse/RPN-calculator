/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;


/**
 * @author Elvir, Markus, Carlos
 */
public class Operand implements Token {

    private double value;
    private String stringOperand;
    
  
     /* konstruktor som skapar en operand */   
     
    public Operand(String token) {
        stringOperand = token;
        value = Double.parseDouble(token);
    }

    @Override
    public double evaluateToken(IsToken st) {
        return value;
    }

    @Override
    public String toString() {

        return (stringOperand);
    }
}
