package es.upm.dit.isst.COMMBIKE.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BICICLETAS")
public class Bicicletas implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "BICIID")
	private Long biciId;
	@Column(name = "ESTADO")
	private String estado;
	
	
	/**
	 * @param biciId
	 * @param estado
	 */
	public Bicicletas(Long biciId, String estado) {
		
		this.biciId = biciId;
		this.estado = estado;
	}


	public Bicicletas() {
		
	}
	
	
	
	public Long getBiciId() {
		return biciId;
	}
	public void setBiciId(Long biciId) {
		this.biciId = biciId;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	@Override
	public String toString() {
		return "Bicicletas [biciId=" + biciId + ", estado=" + estado + "]";
	}
	
	
	
	
	

}
