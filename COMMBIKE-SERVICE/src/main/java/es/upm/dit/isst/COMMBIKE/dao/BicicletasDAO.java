package es.upm.dit.isst.COMMBIKE.dao;

import java.util.List;

import es.upm.dit.isst.COMMBIKE.model.Bicicletas;;

public interface BicicletasDAO {
	
	
	public Bicicletas create(Bicicletas usuario);
	public Bicicletas read(Long biciId);
	public Bicicletas update(Bicicletas usuario);
	public Bicicletas delete(Bicicletas usuario);
	public List<Bicicletas> readAll();
	public List<Bicicletas> readAll(String estado);

}
