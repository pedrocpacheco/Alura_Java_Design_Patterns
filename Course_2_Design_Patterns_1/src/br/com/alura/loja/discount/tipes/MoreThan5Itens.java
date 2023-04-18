package br.com.alura.loja.discount.tipes;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public class MoreThan5Itens extends Discount{
    
    public MoreThan5Itens(Discount nexDiscount) {
        super(nexDiscount);
    }

    public BigDecimal execCalculation(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean mustAply(Budget budget) {
        return budget.getItensQuantity() > 5;
    }

}
