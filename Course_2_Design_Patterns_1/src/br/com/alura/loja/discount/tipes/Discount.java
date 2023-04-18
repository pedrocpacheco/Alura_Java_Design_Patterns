package br.com.alura.loja.discount.tipes;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public abstract class Discount {
  
    protected Discount nextDiscount;

    public Discount(Discount nexDiscount){
        this.nextDiscount = nexDiscount;
    }

    public BigDecimal calculate(Budget budget){
        if(mustAply(budget))
            return execCalculation(budget);
        return nextDiscount.calculate(budget);
    }

    public abstract BigDecimal execCalculation(Budget budget);

    public abstract boolean mustAply(Budget budget);


}
