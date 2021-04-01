package es.upm.dit.isst.COMMBIKE.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ALQUILERES")
public class Alquiler implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "USERID")
	private Long userId;
	@Id
	@Column(name = "BICIID")
	private Long biciId;
	@Column(name = "HORAINICIO")
	private Date horaInicio;
	@Column(name = "HORAFIN")
	private Date horaFin;
	
	
	/**
	 * @param userId
	 * @param biciId
	 * @param horaInicio
	 * @param horaFin
	 */
	public Alquiler(Long userId, Long biciId, Date horaInicio, Date horaFin) {
		
		this.userId = userId;
		this.biciId = biciId;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}
	
	public Alquiler() {
		
	}
	
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getBiciId() {
		return biciId;
	}
	public void setBiciId(Long biciId) {
		this.biciId = biciId;
	}
	public Date getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}
	public Date getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

	@Override
	public String toString() {
		return "Alquiler [userId=" + userId + ", biciId=" + biciId + ", horaInicio=" + horaInicio + ", horaFin="
				+ horaFin + "]";
	}
	
	

}
