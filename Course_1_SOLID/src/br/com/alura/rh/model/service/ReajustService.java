package br.com.alura.rh.model.service;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.classes.Employee;
import br.com.alura.rh.model.service.Validations.ValidationReajust;

public class ReajustService {

    private List<ValidationReajust> validations;

    public ReajustService(List<ValidationReajust> validations){
        this.validations = validations;
    }

    public void reajustSalary(Employee employee, BigDecimal raise){
        this.validations.forEach(v -> v.validate(employee, raise));

        employee.updateSalary(employee.getSalary().add(raise));
    }
    
}
