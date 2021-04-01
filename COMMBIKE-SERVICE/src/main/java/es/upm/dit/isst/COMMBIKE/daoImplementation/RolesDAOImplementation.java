package es.upm.dit.isst.COMMBIKE.daoImplementation;

import java.util.List;

import es.upm.dit.isst.COMMBIKE.dao.RolesDAO;
import es.upm.dit.isst.COMMBIKE.model.Roles;

public class RolesDAOImplementation implements RolesDAO {

	private static  RolesDAOImplementation instancia = null;
	  private RolesDAOImplementation() {
	  }

	 public static RolesDAOImplementation getInstancia() {
	    if( null == instancia )
	      instancia = new RolesDAOImplementation();
	    return instancia;
	  }
	
	
	@Override
	public Roles create(Roles usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Roles read(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Roles update(Roles usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Roles delete(Roles usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Roles> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Roles> readAll(String rol) {
		// TODO Auto-generated method stub
		return null;
	}

}
