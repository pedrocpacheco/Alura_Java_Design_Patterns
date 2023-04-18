package br.com.alura.loja.tests;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.discount.DiscountCalculator;

public class DiscountTest {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("1000"), 1);
        Budget budget2 = new Budget(new BigDecimal("200"), 50);

        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println();
    
        System.out.println(calculator.calculate(budget));
        System.out.println(calculator.calculate(budget2));
        
        
    }
}
