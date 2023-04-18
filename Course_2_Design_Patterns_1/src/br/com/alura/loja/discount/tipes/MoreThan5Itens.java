package br.com.alura.loja.discount.tipes;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public class MoreThan5Itens extends Discount{
    
    public MoreThan5Itens(Discount nexDiscount) {
        super(nexDiscount);
    }

    public BigDecimal calculate(Budget budget){

        if(budget.getItensQuantity() > 5)
            return budget.getValue().multiply(new BigDecimal("0.1"));
        
        return nextDiscount.calculate(budget);
        
    }

}
