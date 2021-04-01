package es.upm.dit.isst.COMMBIKE.dao;

import java.util.List;

import es.upm.dit.isst.COMMBIKE.model.Roles;;

public interface RolesDAO {
	
	public Roles create(Roles usuario);
	public Roles read(Long userId);
	public Roles update(Roles usuario);
	public Roles delete(Roles usuario);
	public List<Roles> readAll();
	public List<Roles> readAll(String rol);

}
