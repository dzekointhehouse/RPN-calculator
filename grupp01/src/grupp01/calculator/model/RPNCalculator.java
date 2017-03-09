/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model;

/**
 * @author Elvir, Markus, Carlos
 */
import grupp01.calculator.model.token.*;
import grupp01.calculator.model.token.Operand;

public class RPNCalculator {

    private IsToken stack;

    public RPNCalculator() {
        stack = new TokenStack();
    }

    /**
     * Delar input strängen och lägger varje token på stacken genom att skapa
     * den motsvarande typen operator eller operand.
     */
    private void inputStackTokens(String stringExpression) throws IllegalArgumentException {

        String str = new String(stringExpression);
        
        stack.clearThisToken();

        for (String token : str.split(" ")) {

            // Här kontrolleras om token är giltig
            if (token.matches("[-+]?\\d*\\.?\\d+")) {
                stack.setToken(new Operand(token));
            } else {
                switch (token) {
                    case "+":
                        stack.setToken(new PlusOperator());
                        break;
                    case "-":
                        stack.setToken(new MinusOperator());
                        break;
                    case "*":
                        stack.setToken(new MultipOperator());
                        break;
                    case "/":
                        stack.setToken(new DivisionOperator());
                        break;
                    case "%":
                        stack.setToken(new ModulusOperator());
                        break;

                    default:
                        throw new IllegalArgumentException("Error: InvalidTokenException:" + token);
                }
            }
        }
    }

    /**
     * Denna metoden räknar ut uttrycken rekursivt. vi tar in uttrycket, placerar det
     * i inputStackTokens som bearbetar uttrycket och omvandlar det till IsToken. Sedan så behöver 
     * denna metoden bara hämta första token för att hela uttrycket ska räknas ut.
     * @param stringExpression
     * @return
     * @throws IllegalArgumentException 
     */
    public double evaluateExpression(String stringExpression) throws IllegalArgumentException {

        double result = 0.0;

        inputStackTokens(stringExpression);

        if (!stack.isEmpty()) {
            // vi hämtar första token som då hämtar resten för att kunna göra en uträkning.
            result = stack.getToken().evaluateToken(stack);
        }

        if (!stack.isEmpty()) {
            throw new IllegalArgumentException("Error: InvalidOperationException");
        }
        return result;

    }

    /**
     * Metod som "rensar" stacken efter användning eftersom stacken är static så
     * behövs denna vid felinmatning.
     */
    public void clearCalculator() {
        stack.clearThisToken();
    }
}
