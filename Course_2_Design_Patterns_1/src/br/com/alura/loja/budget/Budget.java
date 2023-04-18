package br.com.alura.loja.budget;

import java.math.BigDecimal;

import br.com.alura.loja.budget.situation.Situation;

public class Budget {
    
    private BigDecimal value;
    private int itensQuantity;
    private Situation situation;
    
    public Budget(BigDecimal value, int itensQuantity){
        this.value = value;
        this.itensQuantity = itensQuantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getItensQuantity() {
        return itensQuantity;
    }
   
    public Situation getSituation() {
        return situation;
    }

    public void setSituation(Situation situation) {
        this.situation = situation;
    }

}