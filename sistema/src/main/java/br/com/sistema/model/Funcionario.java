package br.com.sistema.model;

import java.math.BigDecimal;
import java.util.Calendar;

import br.com.sistema.abstrato.Pessoa;

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
	//pesquisar calendar e bigdecimal
	private Calendar dataAdmissao;
	private BigDecimal salario;
	//criar classe para carteira de trabalho, classe DOCUMENTO
	private String cateiraTrabalho; 
	private	String numeroPis;
	private String numeroSeguroDeVida;
	
	
	/***
	 * Getters e setters de Funcionário
	 * @return
	 */
	
	public Calendar getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Calendar dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public String getCateiraTrabalho() {
		return cateiraTrabalho;
	}
	public void setCateiraTrabalho(String cateiraTrabalho) {
		this.cateiraTrabalho = cateiraTrabalho;
	}
	public String getNumeroPis() {
		return numeroPis;
	}
	public void setNumeroPis(String numeroPis) {
		this.numeroPis = numeroPis;
	}
	public String getNumeroSegurodeVida() {
		return numeroSeguroDeVida;
	}
	public void setNumeroSegurodeVida(String numeroSeguroDeVida) {
		this.numeroSeguroDeVida = numeroSeguroDeVida;
	}
	
	/** Final dos getters e setters **/
}
