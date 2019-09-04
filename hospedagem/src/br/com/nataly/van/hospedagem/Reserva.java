/**
 * 
 * @author Nátaly Enne and Van Allem
 *
 */

package br.com.nataly.van.hospedagem;

import java.util.*;

import br.com.nataly.van.servicos.Aposento;
import br.com.nataly.van.servicos.Conta;

public class Reserva {
	
	int codigo;
	Date entrada, saida;
	Hospede hospede;
	Aposento aposento;
	Conta conta;

	LinkedHashSet<Hospede> listaHospedes = new LinkedHashSet<Hospede>();


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Date getEntrada() {
		return entrada;
	}
	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}
	public Date getSaida() {
		return saida;
	}
	public void setSaida(Date saida) {
		this.saida = saida;
	}
	public Hospede getHospede() {
		return hospede;
	}
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
	public Aposento getAposento() {
		return aposento;
	}
	public void setAposento(Aposento aposento) {
		this.aposento = aposento;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	/**
	 * 
	 * @param codigo
	 * @param entrada
	 * @param saida
	 * @param hospede
	 * @param aposento
	 * @param conta
	 */
	public void realizarReserva(int codigo, Date entrada, Date saida, Hospede hospede, Aposento aposento, Conta conta ) {
		this.codigo = codigo;
		this.entrada = entrada;
		this.saida = saida;
		this.hospede = hospede;
		this.aposento = aposento;
		this.conta = conta;

		listaHospedes.add(hospede);
	}

	public void addHospede(Hospede hospede){
		if (listaHospedes.size() >= aposento.getLimiteHospede()){
			System.out.println("Limite de hospedes atingido!");
		}
		else{
			listaHospedes.add(hospede);
		}
	}

	public void imprimirHospede(){
		for(Hospede hash: listaHospedes){
			System.out.println(hash.getNome());
		}
	}
}
