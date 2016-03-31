package br.com.sistema.model;

public class Funcionario extends Pessoa {
	
	/***
	 * Construtor vazio, realizar definição posteriormente. 
	 */
	
	public Funcionario(){
		//tese
	}

	/***
	 * atributos específicos utilizados para cadastro de funcionários 
	 * (atributos "gerais" serão erdados de pessoa)
	 */
	
	private String DataAdmissao;
	private Float Salario;
	private String CateiraTrabalho; 
	private	String numeroPis;
	private String numeroSeguro;
	
	
	/***
	 * geração de geters and seters
	 */
	
	public String getDataAdmissao() {
		return DataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
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
