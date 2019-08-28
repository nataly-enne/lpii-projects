/**
 * 
 * @author Nataly Enne and Van Allem
 *
 */
package br.com.nataly.van.servicos;

public class Aposento {

	int codigo;
	int numero;


	int limiteHospede;
	double valor;
	String descricao;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getLimiteHospede() { return limiteHospede; }

	public void setLimiteHospede(int limiteHospede) { this.limiteHospede = limiteHospede; }


	/**
	 * 
	 * @param codigo
	 * @param numero
	 * @param valor
	 * @param descricao
	 */
	public void cadastrarAposento(int codigo, int numero, double valor, String descricao, int limiteHospede) {
		this.codigo = codigo;
		this.numero = numero;
		this.valor = valor;
		this.descricao = descricao;
		this.limiteHospede = limiteHospede;
	}
}
