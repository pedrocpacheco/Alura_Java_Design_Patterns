package br.com.alura.loja.taxes;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.taxes.tipes.interfaces.Tax;

public class TaxCalculator {
    
    public BigDecimal calculate(Budget budget, Tax tax){
        return tax.calculate(budget);
    }

}
