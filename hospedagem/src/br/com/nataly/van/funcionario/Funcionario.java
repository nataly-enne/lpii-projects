/**
 * 
 * @author Nataly Enne and Van Allem
 *
 */

package br.com.nataly.van.funcionario;

public class Funcionario {

		String matricula, nome;
		double salario;
		
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		/**
		 * 
		 * @param matricula
		 * @param nome
		 * @param salario
		 */
		public void cadastrarFunc(String matricula,String nome, double salario) {
			this.matricula = matricula;
			this.nome = nome;
			this.salario = salario;
			//Adicionar na lista correspondente a camareiro/recepcionista em Hotel
			
		}
		
}
