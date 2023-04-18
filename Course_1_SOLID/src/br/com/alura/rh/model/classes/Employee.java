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

	public void setName(String nome) {
		this.personalData.setName(nome);
	}

	public String getCpf() {
		return this.personalData.getCpf();
	}

	public void setCpf(String cpf) {
		this.personalData.setCpf(cpf);;
	}

	public Role getRole() {
		return this.personalData.getRole();
	}

	public void setRole(Role cargo) {
		this.personalData.setRole(cargo);;
	}

	public BigDecimal getSalary() {
		return this.personalData.getSalary();
	}

	public void setSalary(BigDecimal salario) {
		this.personalData.setSalary(salario);;
	}

	public LocalDate getDateLastReajust() {
		return dateLastReajust;
	}

	public void setDateLastReajust(LocalDate dataUltimoReajuste) {
		this.dateLastReajust = dataUltimoReajuste;
	}

}
