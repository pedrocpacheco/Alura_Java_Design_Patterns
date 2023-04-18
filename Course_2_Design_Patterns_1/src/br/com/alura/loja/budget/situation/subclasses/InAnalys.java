package br.com.alura.loja.budget.situation.subclasses;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.budget.situation.Situation;

public class InAnalys extends Situation{
    public BigDecimal calculateExtraDiscount(Budget budget){
        return budget.getValue().multiply(new BigDecimal("500"));
    }
}
