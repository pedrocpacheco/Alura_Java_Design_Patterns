package br.com.alura.loja.discount.tipes;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public class NoDiscount extends Discount{

    public NoDiscount() {
        super(null);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        return BigDecimal.ZERO;
    }   
}
