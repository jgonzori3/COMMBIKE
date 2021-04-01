package es.upm.dit.isst.COMMBIKE.dao;

import java.util.List;

import es.upm.dit.isst.COMMBIKE.model.Ubicaciones;;

public interface UbicacionesDAO {
	
	public Ubicaciones create(Ubicaciones usuario);
	public Ubicaciones read(Long userId,Long biciId);
	public Ubicaciones update(Ubicaciones usuario);
	public Ubicaciones delete(Ubicaciones usuario);
	public List<Ubicaciones> readAll();
	public List<Ubicaciones> readAll(String ubicacion);

}
