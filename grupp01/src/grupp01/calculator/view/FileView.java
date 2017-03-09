/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupp01.calculator.view;

import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Elvir, Markus, Carlos
 */
public class FileView implements IView {

    /* Attribut */
    private PrintStream printStream;
    private FileReader fileReader;
    private Scanner input;

    /* Konstruktor */
    public FileView(String[] args) {
        try {
            // Vi försöker öppna en print stream till det andra argumentet: output.txt
            printStream = new PrintStream(args[1]);
            // Läser från första: input.txt
            input = new Scanner(fileReader = new FileReader(args[0]));

        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }

    @Override
    public void writeResult(double result) {
        this.printStream.println(String.format("%.2f", result));
    }

    @Override
    public void writeException(String result) {
        this.printStream.println(result);
    }

    @Override
    public void displayIntroMessage() {
        System.out.println("Läser från filerna... ");
    }

    @Override
    public void displayOutroMessage() {
        System.out.println("Beräkningar är färdiga! ");
    }

    @Override
    public String getNextExpression() {
        if (input.hasNext()) {
            return input.nextLine();
        }
        return "";
    }

    @Override
    public void close() {
        this.printStream.close();
        System.exit(0);
    }

}
