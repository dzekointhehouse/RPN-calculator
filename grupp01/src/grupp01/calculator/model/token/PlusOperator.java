/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;

/**
 * @author Elvir, Markus, Carlos
 */
public class PlusOperator implements Token {

    @Override
    public double evaluateToken(IsToken stack) {

        double operand1, operand2, result;

        operand1 = stack.getToken().evaluateToken(stack);
        operand2 = stack.getToken().evaluateToken(stack);
        result = operand2 + operand1;

        return result;
    }

    @Override
    public String toString() {

        return ("+");
    }
}
