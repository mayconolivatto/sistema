package br.com.sistema.model;

public class Usuario extends Funcionario{

		/***
		 * Atributos de usuario, serão usados para o usuario conseguir fazer login no sistema
		 * 
		 */
		private String usuario;
		private String senha;
		private String tipo;
		
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
		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		
		
}
