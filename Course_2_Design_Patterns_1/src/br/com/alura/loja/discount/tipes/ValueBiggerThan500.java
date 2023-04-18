package br.com.alura.loja.discount.tipes;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public class ValueBiggerThan500 extends Discount{

    public ValueBiggerThan500(Discount nexDiscount) {
        super(nexDiscount);
    }

    @Override
    public BigDecimal execCalculation(Budget budget) {
        if(budget.getItensQuantity() > 10)
            return budget.getValue().multiply(new BigDecimal("0.5"));
        
        return nextDiscount.execCalculation(budget);
    }

    @Override
    public boolean mustAply(Budget budget) {
        BigDecimal compared = new BigDecimal("500");
        return budget.getValue().intValue() > compared.intValue();
    }   

    
    
}
