package com.jwt.hibernate.bean;

import java.io.Serializable;
import java.sql.Date;

public class Aluno implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long matricula;
	 
	private String nome;
 
	private String telefone;
 
	private String email;
 
	private Date dataCadastro;
 
	public Aluno() {}
 
	public Aluno(Long matricula) {
		super();
		this.matricula = matricula;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome
				+ ", telefone=" + telefone + ", email=" + email
				+ ", dataCadastro=" + dataCadastro + "]";
	}

	/**
	 * @return the matricula
	 */
	public Long getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the dataCadastro
	 */
	public Date getDataCadastro() {
		return dataCadastro;
	}

	/**
	 * @param date the dataCadastro to set
	 */
	public void setDataCadastro(java.util.Date date) {
		this.dataCadastro = (Date) date;
	}
	
}
