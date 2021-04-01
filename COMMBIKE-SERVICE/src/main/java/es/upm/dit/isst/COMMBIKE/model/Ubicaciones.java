package es.upm.dit.isst.COMMBIKE.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UBICACIONES")
public class Ubicaciones  implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USERID")
	private Long userId;
	
	@Column(name = "UBICACION")
	private String ubicacion;
	@Id
	@Column(name = "BICIID")
	private Long biciId;
	
	
	/**
	 * @param userId
	 * @param ubicacion
	 * @param biciId
	 */
	public Ubicaciones(Long userId, String ubicacion, Long biciId) {

		
		this.userId = userId;
		this.ubicacion = ubicacion;
		this.biciId = biciId;
	}
	public Ubicaciones() {
		
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Long getBiciId() {
		return biciId;
	}
	public void setBiciId(Long biciId) {
		this.biciId = biciId;
	}
	
	
	@Override
	public String toString() {
		return "Ubicaciones [userId=" + userId + ", ubicacion=" + ubicacion + ", biciId=" + biciId + "]";
	}
	

}
