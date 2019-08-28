/**
 * 
 * @author Nátaly Enne and Van Allem
 *
 */

package br.com.nataly.van.funcionario;

import java.util.*;

public class Recepcionista extends Funcionario{

	List<String> idiomasQueDomina = new ArrayList<String>();
	
	public List<String> getIdiomasQueDomina() {
		return idiomasQueDomina;
	}

	public void setIdiomasQueDomina(List<String> idiomasQueDomina) {
		this.idiomasQueDomina = idiomasQueDomina;
	}

	public void addIdioma(String idioma) { // Fun��o para ser possivel adicionar idiomas a lista
		 idiomasQueDomina.add(idioma);
	}
	
	/**
	 *  Teste pra saber se imprime
	 */
	public void imprimeListaIdiomas() {
//		for(String x:idiomasQueDomina) {
//			System.out.println(x);
//		}
	}
	
	 @Override
	 public void cadastrarFunc(String matricula,String nome, double salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
		//Adicionar na lista correspondente a camareiro/recepcionista em Hotel
	}
}
