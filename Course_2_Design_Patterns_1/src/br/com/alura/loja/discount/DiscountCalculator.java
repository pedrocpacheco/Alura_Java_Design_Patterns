package br.com.alura.loja.discount;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.discount.tipes.Discount;
import br.com.alura.loja.discount.tipes.ValueBiggerThan500;
import br.com.alura.loja.discount.tipes.MoreThan5Itens;
import br.com.alura.loja.discount.tipes.NoDiscount;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget){
        Discount discount = new MoreThan5Itens(new ValueBiggerThan500(new NoDiscount()));
        return discount.execCalculation(budget);
    }
}
