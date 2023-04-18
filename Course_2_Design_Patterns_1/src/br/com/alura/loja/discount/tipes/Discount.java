package br.com.alura.loja.discount.tipes;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public abstract class Discount {
  
    protected Discount nextDiscount;

    public Discount(Discount nexDiscount){
        this.nextDiscount = nexDiscount;
    }

    public abstract BigDecimal calculate(Budget budget);

}
