package br.com.alura.loja.discount.tipes;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public class MoreThan10itens extends Discount{

    public MoreThan10itens(Discount nexDiscount) {
        super(nexDiscount);
    }

    @Override
    public BigDecimal calculate(Budget budget) {
        if(budget.getItensQuantity() > 10)
            return budget.getValue().multiply(new BigDecimal("0.5"));
        
        return nextDiscount.calculate(budget);
    }   

    
    
}
