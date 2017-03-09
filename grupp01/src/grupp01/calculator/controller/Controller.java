/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.controller;

import grupp01.calculator.model.*;
import grupp01.calculator.view.*;

/**
 * @author Elvir, Markus, Carlos
 */
public class Controller {

    private RPNCalculator calc;
    private IView view;

    /**
     * Om vi inte har några argument så använder vi commandview, för att direkt
     * kunna mata in ett uttryck, annars använder vi argument: en input fil och
     * en output fil.
     *
     * @param args kommandoradsväxlar
     */
    public Controller(String[] args) {
        try {
            if (args.length == 0) {
                view = new CommandView();
            } else {
                view = new FileView(args); // PrintStream skapas istället i FileViews konstruktor
            }
            calc = new RPNCalculator();
        } catch (Exception e) {
            System.out.println("Syntax: java Calculator [källfil destinationsfil]");
        }
    }

    /**
     * väljer och kör commandVersion eller fileVersion beroende på argumenten.
     *
     */
    public void run() {

        String stringExpression;

        view.displayIntroMessage();
        
        while (true) {
            try {

                stringExpression = view.getNextExpression(); // 1) hämta nästa RPN-sträng

                if (stringExpression.isEmpty()) {
                    view.displayOutroMessage();
                    view.close();
                    //System.exit(0);
                }

                double result = calc.evaluateExpression(stringExpression); // 2) beräkna resultatet

                view.writeResult(result); // 3) skriv ut svaret

            } catch (Exception e) {
                view.writeException(e.getMessage());
            }
        }
    }

}
