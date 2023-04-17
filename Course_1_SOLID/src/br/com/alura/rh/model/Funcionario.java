package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.rh.ValidacaoException;

public class Funcionario {

	private String name;
	private String cpf;
	private Role role;
	private BigDecimal salary;
	private LocalDate dateLastReajust;

	public Funcionario(String name, String cpf, Role role, BigDecimal salary) {
		this.name = name;
		this.cpf = cpf;
		this.role = role;
		this.salary = salary;
	}

	public void reajustSalary(BigDecimal raise) {
		BigDecimal percentualReajuste = raise.divide(salary, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		this.salary = this.salary.add(raise);
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
