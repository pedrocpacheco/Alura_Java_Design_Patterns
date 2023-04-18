package br.com.alura.rh.model.classes;

import java.math.BigDecimal;

public class Outsourced extends Employee{

    private String company;

    public Outsourced(String name, String cpf, Role role, BigDecimal salary) {
        super(name, cpf, role, salary);
    }
   
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
