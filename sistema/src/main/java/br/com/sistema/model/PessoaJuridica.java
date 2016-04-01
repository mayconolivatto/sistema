package br.com.sistema.model;

import br.com.sistema.abstrato.Pessoa;

public class PessoaJuridica extends Pessoa {

	/***
	 * Atributos exclusivos de pessoas juridicas
	 */
	private String cnpj;
	private String razaoSocial;
	private String inscricaoEstadual;
	
	
	/***
	 * Construtor aberto, decidir depois como faremos.
	 */
	public PessoaJuridica() {
		super();
	}

	/***
	 * Getters e setters
	 */
	
	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}


	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	/** Final dos getters e setters **/
}
