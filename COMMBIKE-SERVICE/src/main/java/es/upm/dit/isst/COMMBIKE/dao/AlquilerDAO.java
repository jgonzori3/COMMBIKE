package es.upm.dit.isst.COMMBIKE.dao;

import java.sql.Date;
import java.util.List;

import es.upm.dit.isst.COMMBIKE.model.Alquiler;;

public interface AlquilerDAO {
	
	public Alquiler create(Alquiler usuario);
	public Alquiler read(Long userId,Long biciId);
	public Alquiler update(Alquiler usuario);
	public Alquiler delete(Alquiler usuario);
	public List<Alquiler> readAll();
	public List<Alquiler> readAll(Date horaInicio,Date horaFin);
	public List<Alquiler> readAll(Date hora);

}
