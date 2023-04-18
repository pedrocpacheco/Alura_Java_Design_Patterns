package br.com.alura.rh.model.classes;

import java.math.BigDecimal;

public class PersonalData {

    private String name;
	private String cpf;
	private Role role;
	private BigDecimal salary;

    public PersonalData(String name, String cpf, Role role, BigDecimal salary) {
		this.name = name;
		this.cpf = cpf;
		this.role = role;
		this.salary = salary;
	}

    public String getName() {
        return name;
    }
    public String getCpf() {
        return cpf;
    }
    public Role getRole() {
        return role;
    }

    public BigDecimal getSalary() {
        return salary;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
    
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

}
