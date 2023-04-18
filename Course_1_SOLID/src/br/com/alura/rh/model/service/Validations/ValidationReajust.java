package br.com.alura.rh.model.service;

import java.math.BigDecimal;

import br.com.alura.rh.model.Employee;

public interface ValidationReajust {
    
    public void validate(Employee employee, BigDecimal raise);

}
