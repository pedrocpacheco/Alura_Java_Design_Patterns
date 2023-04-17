package br.com.alura.rh.model.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Employee;

public class ReajustService {
    public void reajustSalary(Employee employee, BigDecimal raise){

        BigDecimal salary = employee.getSalary();

        BigDecimal percentualReajust = raise.divide(salary, RoundingMode.HALF_UP);
		if (percentualReajust.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
        employee.updateSalary(salary.add(raise));
    }
}
