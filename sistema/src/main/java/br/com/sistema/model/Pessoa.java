package br.com.sistema.model;

public abstract class Pessoa {

	/***
	 * Construtor aberto, decidir depois como faremos.
	 */
	public Pessoa() {
	}

	
	/***
	 * Atributos que serão passados para as classes de funcionario, pessoa
	 * fisica e pessoa jurídica.
	 * 
	 */
	private long codigo;
	private String nome;
	private String email;
	private String telefone;
	private String logradouro;
	private int numero;
	private String bairro;
	private int cep;
	private String cidade;
	private String estado;
	private String complemento;

	/***
	 * Getters e setters
	 * 
	 * @return
	 */
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	/** Final dos getters e setters **/

}
