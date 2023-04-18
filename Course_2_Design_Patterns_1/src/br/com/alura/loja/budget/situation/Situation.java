package br.com.alura.loja.budget.situation;

import br.com.alura.loja.budget.Budget;
import br.com.alura.loja.budget.situation.exceptions.DomainException;

public abstract class Situation {

    public void aprove(Budget budget){
        throw new DomainException("Budget cannot be aproved!");
    }

    public void reproved(Budget budget){
        throw new DomainException("Budget cannot be reproved!");
    }

}
