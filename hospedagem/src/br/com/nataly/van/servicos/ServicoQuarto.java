/**
 * 
 * @author Nataly Enne and Van Allem
 *
 */
package br.com.nataly.van.servicos;

import java.util.Date;

import br.com.nataly.van.funcionario.Camareiro;
import br.com.nataly.van.hospedagem.Reserva;

public class ServicoQuarto {

	Date data;
	Reserva reserva;
	Camareiro camareiro;
	boolean realizado;
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Camareiro getCamareiro() {
		return camareiro;
	}

	public void setCamareiro(Camareiro camareiro) {
		this.camareiro = camareiro;
	}

	public boolean isRealizado() {
		return realizado;
	}

	public void setRealizado(boolean realizado) {
		this.realizado = realizado;
	}
	
	/**
	 * 
	 * @param reserva
	 * @param camareiro
	 * @param data
	 */
	public void realizarServicoQuarto(Reserva reserva, Camareiro camareiro, Date data) {
		this.reserva = reserva;
		this.camareiro = camareiro;
		this.data = data;
		this.realizado = true;
	}
	
	/**
	 * 	
	 * @param reserva
	 * @param camareiro
	 * @param data
	 */
	public void agendarServicoQuarto(Reserva reserva, Camareiro camareiro, Date data) {
		this.reserva = reserva;
		this.camareiro = camareiro;
		this.data = data;
		this.realizado = false;
	}
}


