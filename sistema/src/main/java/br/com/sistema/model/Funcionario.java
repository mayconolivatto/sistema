package br.com.sistema.model;

import java.sql.Date;

public class Funcionario extends Pessoa {
	
	/***
	 * Construtor vazio, realizar definição posteriormente. 
	 */
	
	public Funcionario(){
	}

	/***
	 * atributos específicos utilizados para cadastro de funcionários 
	 * (atributos "gerais" serão erdados de pessoa)
	 */
	
	private Date DataAdmissao;
	private Float Salario;
	private String CateiraTrabalho; 
	private	String numeroPis;
	private String numeroSeguro;
	
	
	/***
	 * Getters e setters de Funcionário
	 * @return
	 */
	
	public Date getDataAdmissao() {
		return DataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		DataAdmissao = dataAdmissao;
	}
	public Float getSalario() {
		return Salario;
	}
	public void setSalario(Float salario) {
		Salario = salario;
	}
	public String getCateiraTrabalho() {
		return CateiraTrabalho;
	}
	public void setCateiraTrabalho(String cateiraTrabalho) {
		CateiraTrabalho = cateiraTrabalho;
	}
	public String getNumeroPis() {
		return numeroPis;
	}
	public void setNumeroPis(String numeroPis) {
		this.numeroPis = numeroPis;
	}
	public String getNumeroSeguro() {
		return numeroSeguro;
	}
	public void setNumeroSeguro(String numeroSeguro) {
		this.numeroSeguro = numeroSeguro;
	}
	
	
}
