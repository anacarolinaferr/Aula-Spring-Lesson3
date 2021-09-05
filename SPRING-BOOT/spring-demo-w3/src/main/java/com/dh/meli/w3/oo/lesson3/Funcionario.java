package com.dh.meli.w3.oo.lesson3;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Funcionario{

	private String nome;
	private String sexo;
	private Double salario;

	private static DecimalFormat df = new DecimalFormat("#.##");

	public Funcionario() {
		
	}
	
	public Funcionario(String n, String s, double sal) {
		nome = n;
		sexo = s;
		salario = sal;
	}
	
	public double getSalario() {
		return salario;
	}

	public String getNome() {
		return nome.toUpperCase();
	}
	
	public String getSexo() {
		return sexo;
	}
	
	@Override
	public String toString() {
		return nome + "         " + sexo + "        " + NumberFormat.getCurrencyInstance().format(salario).replaceAll("\\u00A0", "");
	}
}
