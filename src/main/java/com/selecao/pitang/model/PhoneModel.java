package com.selecao.pitang.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "telefone")
public class PhoneModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(generator = "increment") 
	@Column(name="id")
	@GenericGenerator(name = "increment", strategy = "increment") 
	private int id;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private UserModel usuario;
	
	@NotBlank
	@Column(name="number")
	private String number;

	@NotBlank
	@Column(name="area_code")
	private String area_code;
	
	@NotBlank
	@Email
	@Column(name="country_code")
	private String country_code;

	public int getId() {
		return id;
	}
	
	public UserModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UserModel usuario) {
		this.usuario = usuario;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getArea_code() {
		return area_code;
	}

	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	
	
}
