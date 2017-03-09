/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;

import java.util.Stack;

/**
 * @author Elvir, Markus, Carlos
 */

/**
 * 
 * Implementation till IsToken som implementerar metoder som 
 * hanterar Token typen.
 */
public class TokenStack implements IsToken {

    private Stack<Token> stack;

    /* Instansierar stacken i konstruktorn*/
    public TokenStack() {
        stack = new Stack<>();
    }

    /* visar det som är det sista elementet i stacken.*/
    @Override
    public Token showToken() {
        return stack.peek();
    }

    /* retunerar det som är det sista elementet i stacken.*/
    @Override
    public Token getToken() {
        return stack.pop();
    }

    /* sätter in ett element i staken*/
    @Override
    public void setToken(Token to) {
        stack.push(to);
    }

    @Override
    public Boolean isEmpty() {
        return (stack.isEmpty());
    }

    @Override
    public void displayTopToken() {
        System.out.println(String.valueOf((Object) stack.peek()));
    }

    @Override
    public void clearThisToken() {
        stack.clear();
    }
}
