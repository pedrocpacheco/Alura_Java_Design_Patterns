package br.com.alura.rh.model.classes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

	private String name;
	private String cpf;
	private Role role;
	private BigDecimal salary;
	private LocalDate dateLastReajust;

	public Employee(String name, String cpf, Role role, BigDecimal salary) {
		this.name = name;
		this.cpf = cpf;
		this.role = role;
		this.salary = salary;
	}

	public void updateSalary(BigDecimal newSalary) {
		this.salary = newSalary;
		this.dateLastReajust = LocalDate.now();
	}

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role cargo) {
		this.role = cargo;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salario) {
		this.salary = salario;
	}

	public LocalDate getDateLastReajust() {
		return dateLastReajust;
	}

	public void setDateLastReajust(LocalDate dataUltimoReajuste) {
		this.dateLastReajust = dataUltimoReajuste;
	}

}
