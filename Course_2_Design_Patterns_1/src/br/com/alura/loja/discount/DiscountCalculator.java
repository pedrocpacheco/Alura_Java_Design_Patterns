package br.com.alura.loja.discount;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.discount.tipes.Discount;
import br.com.alura.loja.discount.tipes.MoreThan10itens;
import br.com.alura.loja.discount.tipes.MoreThan5Itens;
import br.com.alura.loja.discount.tipes.NoDiscount;

public class DiscountCalculator {
    public BigDecimal calculate(Budget budget){
        Discount discount = new MoreThan5Itens(new MoreThan10itens(new NoDiscount()));
        return discount.calculate(budget);
    }
}
