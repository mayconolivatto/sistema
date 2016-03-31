package br.com.sistema.model;

public class PessoaJuridica extends Pessoa {

	/***
	 * Atributos exclusivos de pessoas juridicas
	 */
	private String cnpj;
	private String razaoSocial;
	private long inscricaoEstadual;
	
	
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


	public long getInscricaoEstadual() {
		return inscricaoEstadual;
	}


	public void setInscricaoEstadual(long inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
}
