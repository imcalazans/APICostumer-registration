package com.ismaelMoreira.costumer.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import com.ismaelMoreira.costumer.entity.Client;

public class ClientDTO implements Serializable{
private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private Integer children;
	private Instant birthDate;
	
	
	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String cpf, Double income, Instant bithDate, Integer children) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		bithDate = bithDate;
		children = children;
	}
	
	public ClientDTO(Client client) {
		super();
		this.id = client.getId();
		this.name = client.getName();
		this.cpf = client.getCpf();
		this.income = client.getIncome();
		birthDate = client.getBirthDate();
		children = client.getChildren();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Instant getBithDate() {
		return birthDate;
	}

	public void setBithDate(Instant bithDate) {
		bithDate = bithDate;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		children = children;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientDTO other = (ClientDTO) obj;
		return Objects.equals(id, other.id);
	}
}