package es.upm.dit.isst.COMMBIKE.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "ROLES")
public class Roles implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USERID")
	private Long userId;
	
	@Column(name = "ROL")
	private String rol;
	
	
	/**
	 * @param userId
	 * @param rol
	 */
	public Roles(Long userId, String rol) {
		
		this.userId = userId;
		this.rol = rol;
	}



	
	
	
	
	public Roles() {
		// TODO Auto-generated constructor stub
	}



	public Long getUserId() {
		return userId;
	}



	public void setUserId(Long userId) {
		this.userId = userId;
	}



	public String getRol() {
		return rol;
	}



	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
	@Override
	public String toString() {
		return "Roles [userId=" + userId + ", rol=" + rol + "]";
	}
	
}
