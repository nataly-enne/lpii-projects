/**
 * 
 * @author Nátaly Enne and Van Allem
 *
 */

package br.com.nataly.van.hospedagem;

import java.util.ArrayList;
import java.util.List;

import br.com.nataly.van.funcionario.Camareiro;
import br.com.nataly.van.funcionario.Recepcionista;
import br.com.nataly.van.servicos.Aposento;

public class Hotel {

	String nome, cnpj;
	
	List<Reserva> reservas = new ArrayList<Reserva>();
	List<Recepcionista> recepcionistas = new ArrayList<Recepcionista>();
	List<Camareiro> camareiros = new ArrayList<Camareiro>();
	List<Hospede> hospedes = new ArrayList<Hospede>(); //Nova lista
	List<Aposento> aposentos = new ArrayList<Aposento>(); //Nova lista
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Reserva> getReservas() {
		return reservas;
	}
	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	public List<Recepcionista> getRecepcionista() {
		return recepcionistas;
	}
	public void setRecepcionista(List<Recepcionista> recepcionista) {
		this.recepcionistas = recepcionista;
	}
	public List<Camareiro> getCamareiro() {
		return camareiros;
	}
	public void setCamareiro(List<Camareiro> camareiro) {
		this.camareiros = camareiro;
	}
	public List<Hospede> getHospede() {
		return hospedes;
	}
	public void setHospede(List<Hospede> hospede) {
		this.hospedes = hospede;
	}
	public List<Aposento> getAposentos() {
		return aposentos;
	}
	public void setAposentos(List<Aposento> aposentos) {
		this.aposentos = aposentos;
	}
	public void addHospedagem(Reserva h) {
		reservas.add(h);
	}
	public void addRecpcionista(Recepcionista r) {
		recepcionistas.add(r);
	}
	public void addCamareiro(Camareiro c) {
		camareiros.add(c);
	}
	public void addHospede(Hospede hos) {
		hospedes.add(hos);
	}
	public void addAposento(Aposento a) {
		aposentos.add(a);
	}
	

}
