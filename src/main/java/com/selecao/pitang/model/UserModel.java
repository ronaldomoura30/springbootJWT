package com.selecao.pitang.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "usuario")
public class UserModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id	
	@GeneratedValue(generator = "increment") 
	@Column(name="id_usuario")
	@GenericGenerator(name = "increment", strategy = "increment") 
	private int id;
	
	@NotBlank
	@Column(name="first_name")
	private String firstName;
	
	@NotBlank
	@Column(name="last_name")
	private String lastName;
	
	@NotBlank
	@Email
	@Column(name="email")
	private String email;
	
	@NotBlank
	@Column(name="password")
	private String password;
	
//	@OneToMany(mappedBy="usuario", fetch = FetchType.LAZY)
//	private List<PhoneModel> phones;
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

//	public List<PhoneModel> getPhones() {
//		return phones;
//	}
//
//	public void setPhones(List<PhoneModel> phones) {
//		this.phones = phones;
//	}
}
