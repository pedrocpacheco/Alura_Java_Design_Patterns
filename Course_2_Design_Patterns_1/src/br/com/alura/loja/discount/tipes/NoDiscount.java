package br.com.alura.loja.discount.tipes;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public class NoDiscount extends Discount{

    public NoDiscount() {
        super(null);
    }

    @Override
    public BigDecimal execCalculation(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean mustAply(Budget budget) {
        return true;
    }
}
