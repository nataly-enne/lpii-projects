/**
 * 
 * @author Nataly Enne and Van Allem
 *
 */

package br.com.nataly.van.servicos;

public class Consumo {

	int codigo, quantidade;
	String descricao;
	double valorUnitario;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	/**
	 * 
	 * @param codigo
	 * @param quantidade
	 * @param descricao
	 * @param valorUnitario
	 */
	public void consumirItem(int codigo,int quantidade,String descricao,double valorUnitario) {
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		//Adicionar a lista em conta
		
	}
}
