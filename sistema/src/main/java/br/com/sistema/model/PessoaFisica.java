package br.com.sistema.model;
import java.util.Calendar;

public class PessoaFisica extends Pessoa {

	/**
	 * Construtor vazio, realizar definição posteriormente.
	 */
	public PessoaFisica(){
		
	}
	
	/***
	 * atributos específicos utilizados para cadastro de funcionários 
	 * (atributos "gerais" serão herdados de pessoa)
	 */
	
	
	private String cpf;
	private String rg;
	private String sexo;
	private Calendar dataNascimento;
	
	/***
	 * Getters e setters de PessoaFisica
	 * @return
	 */	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}