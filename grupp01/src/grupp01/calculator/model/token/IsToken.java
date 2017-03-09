/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.model.token;

/**
 * @author Elvir, Markus, Carlos
 */
public interface IsToken {

    public Token getToken();

    public void setToken(Token to);

    public Boolean isEmpty();

    public Token showToken();

    public void displayTopToken();

    public void clearThisToken();
}
