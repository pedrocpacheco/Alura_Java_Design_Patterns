package br.com.alura.rh.model.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Employee;

public class ValidationReajustPercentenge implements ValidationReajust{
    
    public void validate(Employee employee, BigDecimal raise){
        BigDecimal percentualReajust = raise.divide(employee.getSalary(), RoundingMode.HALF_UP);
		if (percentualReajust.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste cannot be higher than 40% of the salary");
		}
    }

}
