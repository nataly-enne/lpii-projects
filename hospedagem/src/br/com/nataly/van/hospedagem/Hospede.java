/**
 * 
 * @author Nátaly Enne and Van Allem
 *
 */

package br.com.nataly.van.hospedagem;

import java.util.Objects;

public class Hospede {

	int codigo;
	String nome, cpf, rg, telefone;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/**
	 * 
	 * @param codigo
	 * @param nome
	 * @param cpf
	 * @param rg
	 * @param telefone
	 */
	public void cadastrarHospede(int codigo,String nome, String cpf,String rg,String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Hospede hospede = (Hospede) o;
		return codigo == hospede.codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
}
