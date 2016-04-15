package br.com.sistema.abstrato;

import br.com.sistema.model.Endereco;

public abstract class Pessoa {
	
	/***
	 * Atributos genériocos  que serão passados para as classes de funcionario, pessoa
	 * fisica e pessoa jurídica.
	 */
	private Long codigo; //sequencial gerado automaticamente.
	private String nome;
	private String email;
	private String telefoneResidencial;
	private String telefoneCelular;
	private String telefoneComercial;
	private Endereco endereco;
	/***
	 * Getters e setters
	 * @return
	 */

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefoneResidencial() {
		return telefoneResidencial;
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	/** Final dos getters e setters **/

}
