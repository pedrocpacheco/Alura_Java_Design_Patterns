package br.com.alura.rh.model.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Employee;

public class ValidationReajustsInterval {
    public void validate(Employee employee, BigDecimal raise){
        long mounthsSinceLastReajust = ChronoUnit.MONTHS.between(employee.getDateLastReajust(), LocalDate.now());
        if(mounthsSinceLastReajust < 6){
            throw new ValidacaoException("The Last Reajust was Too Soon");
        }
    }
}
