package br.com.alura.rh.model.service.Validations;

import java.math.BigDecimal;

import br.com.alura.rh.model.classes.Employee;

public interface ValidationReajust {
    
    public void validate(Employee employee, BigDecimal raise);

}
