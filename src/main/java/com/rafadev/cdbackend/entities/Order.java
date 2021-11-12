package com.rafadev.cdbackend.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id

	private Integer id;
	private String cpf;
	private String cnpj;
	private Instant created;
	private Date dtnascimento;
	private String nome;
	private String rzsocial;

	public Order() {

	}

	public Order(Integer id, String cpf, String cnpj, Instant created, Date dtnascimento, String nome,
			String rzsocial) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.created = created;
		this.dtnascimento = dtnascimento;
		this.nome = nome;
		this.rzsocial = rzsocial;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
	}

	public Date getDtnascimento() {
		return dtnascimento;
	}

	public void setDtnascimento(Date dtnascimento) {
		this.dtnascimento = dtnascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRzsocial() {
		return rzsocial;
	}

	public void setRzsocial(String rzsocial) {
		this.rzsocial = rzsocial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
