package es.upm.dit.isst.COMMBIKE.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIOS")
public class Usuarios implements Serializable {

	/**
	 * @param correo
	 * @param userId
	 * @param contraseña
	 * @param tarjeta
	 */
	public Usuarios(String correo, long userId, String contraseña, String tarjeta) {
		
		this.correo = correo;
		this.userId = userId;
		this.contraseña = contraseña;
		this.tarjeta = tarjeta;
	}

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CORREO")
	private String correo;
	@Id
	@Column(name = "USERID")
	private Long userId;
	@Column(name = "CONTRASEÑA")
	private String contraseña;
	@Column(name = "TARJETA")
	private String tarjeta;
	
	public Usuarios() {
		
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Override
	public String toString() {
		return "Usuarios [correo=" + correo + ", userId=" + userId + ", contraseña=" + contraseña + ", tarjeta="
				+ tarjeta + "]";
	}
	
}
