/**
 * 
 * @author Nataly Enne and Van Allem
 *
 */
package br.com.nataly.van.servicos;

import java.util.*;

public class Conta {

	int codigo;
	double valor;
	boolean pago;
	
	List<Consumo> consumos = new ArrayList<Consumo>();
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public List<Consumo> getConsumo() {
		return consumos;
	}

	public void setConsumo(List<Consumo> consumo) {
		this.consumos = consumo;
	}
	
	public void abrirConta(int codigo) {
		valor = 0;
		pago = false;
	}
	/**
	 * 
	 * @param codigo
	 */
	//Calcular o valor da conta no seu fechamento
	public void fecharConta(int codigo) {
	/*	//Percorrer lista de consumo adicionando quantidade*valor dos itens
		for(Consumo x:consumos) {
			valor = valor + (consumos[x].getQuantidade*consumos[x].getValorUnitario);
		}*/
	}
	/**
	 * 
	 * @param c
	 */
	public void addConsumo(Consumo c) {
		consumos.add(c);
	}
}
