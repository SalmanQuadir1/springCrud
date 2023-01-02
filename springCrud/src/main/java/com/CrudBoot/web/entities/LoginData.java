package com.CrudBoot.web.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class LoginData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotBlank(message="**Email cannot be Empty !!")
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message="**Invalid Email")
	private String email;
	private String password;
	@AssertTrue(message="**Must agree terms and conditions ")
	private boolean agreed;
	
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	public LoginData(int id,
			@NotBlank(message = "*Email cannot be Empty !!") @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "*Invalid Email") String email,
			String password, @AssertTrue(message = "*Must agree terms and conditions ") boolean agreed) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.agreed = agreed;
	}
	public LoginData() {
		super();
	}
	@Override
	public String toString() {
		return "LoginData [id=" + id + ", email=" + email + ", password=" + password + ", agreed=" + agreed + "]";
	}
	

	

}
