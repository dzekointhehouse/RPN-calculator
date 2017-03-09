/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator;

import grupp01.calculator.controller.Controller;

/**
* RPN Calculator till laboration 1, gjord med passion och svett.
*
* @author  Elvir, Carlos och Markus
* @version 2.0
* @since   2016-09-31 
*/

public class Calculator {
    /* Main metod som startar controll metoden
     * med antingen 0 eller 2 kommandoväxlar
     */

    public static void main(String[] args) {

        Controller calculatorController = new Controller(args);
        calculatorController.run();

    }
}
