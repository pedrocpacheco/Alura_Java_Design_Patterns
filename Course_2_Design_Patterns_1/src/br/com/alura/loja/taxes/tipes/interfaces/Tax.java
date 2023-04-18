package br.com.alura.loja.taxes.tipes.interfaces;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;

public interface Tax {

        public BigDecimal calculate(Budget budget);
    
}

