package grupp01.calculator.model.token;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Elvir, Markus, Carlos
 */
public interface Token {

    /**
     * implementationen är stack, men typen är av IsToken och blir castat istället,
     * så att det blir smidigt om implementationen skulle förändras.
     * @param st det bearbetade uttrycket
     * @return uträkning
     */
    public abstract double evaluateToken(IsToken st);
}
