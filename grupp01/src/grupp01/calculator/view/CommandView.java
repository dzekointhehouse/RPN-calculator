/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.view;

import java.util.Scanner;

/**
 *
 * @author Elvir, Markus, Carlos
 */
public class CommandView implements IView {

    private Scanner input = new Scanner(System.in);

    // konstruktor
    public CommandView() {
        
    }


    @Override
    public void writeResult(double result) {
        System.out.println("Resultat: " + result);
    }

    @Override
    public void displayIntroMessage() {
        System.out.println("Ange RPN uttryck <retur> (tom sträng = avsluta): ");
    }

    @Override
    public void displayOutroMessage() {
        System.out.println("Användaren avslutade programmet! ");
    }

    @Override
    public String getNextExpression() {
        return input.nextLine();
    }
    
    @Override
    public void close() {
        System.exit(0);
    }

    @Override
    public void writeException(String result) {
        System.out.println("Blev ngt fel: " + result);
    }

  
}
