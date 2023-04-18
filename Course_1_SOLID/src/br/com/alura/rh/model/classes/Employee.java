package br.com.alura.rh.model.classes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

	private PersonalData personalData;
	private LocalDate dateLastReajust;

	public Employee(String name, String cpf, Role role, BigDecimal salary) {
		this.personalData = new PersonalData(name, cpf, role, salary);
	}

	public void updateSalary(BigDecimal newSalary) {
		this.personalData.setSalary(newSalary);
		this.dateLastReajust = LocalDate.now();
	}

	public void promote(Role role){
		this.personalData.setRole(role);
	}
	
	public String getName() {
		return this.personalData.getName();
	}
	
	public String getCpf() {
		return this.personalData.getCpf();
	}
	
	public Role getRole() {
		return this.personalData.getRole();
	}

	public BigDecimal getSalary() {
		return this.personalData.getSalary();
	}

	public LocalDate getDateLastReajust() {
		return dateLastReajust;
	}

}
