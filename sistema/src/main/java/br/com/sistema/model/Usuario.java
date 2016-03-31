package br.com.sistema.model;

public class Usuario extends Funcionario{

		/***
		 * Atributos de usuario, serão usados para o usuario conseguir fazer login no sistema
		 * 
		 */
		
		private String senha;
		
		//TODO fazer enum de user e adm
		//private String tipo;
		
		/***
		 * Construtor vazio, decidir posteriormente.
		 */
		public Usuario(){
			super();
		}

		/***
		 * Getters e setters de Usuario
		 * @return
		 */
		
		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}
		
//TODO - liberar quando enum estiver pronto
//		public String getTipo() {
//			return tipo;
//		}
//
//		public void setTipo(String tipo) {
//			this.tipo = tipo;
//		}
//		
		
		
}
