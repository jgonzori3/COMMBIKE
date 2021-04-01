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
	 * @param contrase�a
	 * @param tarjeta
	 */
	public Usuarios(String correo, long userId, String contrase�a, String tarjeta) {
		
		this.correo = correo;
		this.userId = userId;
		this.contrase�a = contrase�a;
		this.tarjeta = tarjeta;
	}

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "CORREO")
	private String correo;
	@Id
	@Column(name = "USERID")
	private Long userId;
	@Column(name = "CONTRASE�A")
	private String contrase�a;
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Override
	public String toString() {
		return "Usuarios [correo=" + correo + ", userId=" + userId + ", contrase�a=" + contrase�a + ", tarjeta="
				+ tarjeta + "]";
	}
	
}
