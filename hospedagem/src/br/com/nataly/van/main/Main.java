/**
 * 
 * @author Nataly Enne and Van Allem
 *
 */

package br.com.nataly.van.main;

import java.util.*;
import br.com.nataly.van.funcionario.*;
import br.com.nataly.van.hospedagem.*;
import br.com.nataly.van.servicos.*;

public class Main {
	public static void main(String args[]) {
		
		//Criando Hotel
		Hotel h = new Hotel();
		h.setNome("Hotel A");
		h.setCnpj("00.000.000/0000-00");
		
		//Adicionando Aposento
		Aposento ap = new Aposento();
		ap.cadastrarAposento(001, 101, 200, "Quarto 101", 2);
		h.addAposento(ap);
		
		//Adicionando Camareiro
		Camareiro cam = new Camareiro();
		cam.cadastrarFunc("1001", "Joao", 950.0);
		h.addCamareiro(cam);
		
		//Adicionando Recepcionista
		Recepcionista recep = new Recepcionista();
		recep.cadastrarFunc("2002", "Maria", 1050.0);
		h.addRecpcionista(recep);
		
		//Adicionando Idioma a lista de idiomas falados
		recep.addIdioma("Ingles");
		
		//Imprimindo na tela a lista dos idiomas
		recep.imprimeListaIdiomas();
		
		//Adicionando hospede
		Hospede hosp = new Hospede();
		Hospede hosp2 = new Hospede();

		hosp.cadastrarHospede(01, "Jose", "111.111.111-11", "111.111.111", "99999-9999");
		hosp2.cadastrarHospede(01, "Jose", "111.111.111-11", "111.111.111", "99999-9999");

//		hosp2.cadastrarHospede(01, "Maria", "222.222.222-22", "222.222.222", "88888-8888");

		h.addHospede(hosp);
		h.addHospede(hosp2);
		
		//Criando conta para o hospede
		Conta conta = new Conta();
		conta.abrirConta(001);
		
		//Adicionando reserva
		Reserva reserva = new Reserva();
		Date entrada = new Date(); 
		Date saida = new Date();
		reserva.realizarReserva(001, entrada, saida , hosp, ap, conta); // Pesquisar como passar tipo Date
		h.addHospedagem(reserva);
		reserva.addHospede(hosp2);
		
		//Adicionando cosumo a conta
		Consumo con = new Consumo();
		con.consumirItem(001, 3, "Garrafa de agua", 4.50);
		conta.addConsumo(con);
		
		//Agendado Servico de quarto
		ServicoQuarto sq = new ServicoQuarto();
		Date dataSQ = new Date();
		sq.agendarServicoQuarto(reserva, cam, dataSQ);
		
		//Realizar Servico de quarto
		sq.realizarServicoQuarto(reserva, cam, dataSQ);
		
		//Fechar a conta do hospede
		conta.fecharConta(001);

		reserva.imprimirHospede();



	}
}
