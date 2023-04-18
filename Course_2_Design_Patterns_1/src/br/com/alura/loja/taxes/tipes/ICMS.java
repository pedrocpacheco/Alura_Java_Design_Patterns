package br.com.alura.loja.taxes.tipes;

import java.math.BigDecimal;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.taxes.tipes.interfaces.Tax;

public class ICMS implements Tax{

    @Override
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }

}
