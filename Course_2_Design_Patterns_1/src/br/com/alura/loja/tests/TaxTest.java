package br.com.alura.loja.tests;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.taxes.TaxCalculator;
import br.com.alura.loja.taxes.tipes.ICMS;

public class TaxTest {
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal(1000));
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println(taxCalculator.calculate(budget, new ICMS()));
    }
}
