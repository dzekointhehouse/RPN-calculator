/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.view;

/**
 *
 * @author Elvir, Markus, Carlos
 */
public interface IView {

    public abstract void writeResult(double result);

    public abstract void displayIntroMessage();

    public abstract void displayOutroMessage();

    public abstract String getNextExpression();

    public abstract void close();
    
    public void writeException(String result);
}