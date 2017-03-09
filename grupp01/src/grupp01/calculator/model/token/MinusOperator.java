/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;

/**
 * @author Elvir, Markus, Carlos
 */


public class MinusOperator implements Token {

    @Override
    public double evaluateToken(IsToken st) {
        double operand1, operand2, result;

        operand1 = st.getToken().evaluateToken(st);
        operand2 = st.getToken().evaluateToken(st);
        result = operand2 - operand1;

        return result;
    }

    @Override
    public String toString() {

        return ("-");
    }
}
