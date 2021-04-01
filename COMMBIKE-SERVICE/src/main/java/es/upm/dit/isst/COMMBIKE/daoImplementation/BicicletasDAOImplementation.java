package es.upm.dit.isst.COMMBIKE.daoImplementation;

import java.util.List;

import es.upm.dit.isst.COMMBIKE.dao.BicicletasDAO;
import es.upm.dit.isst.COMMBIKE.model.Bicicletas;

public class BicicletasDAOImplementation implements BicicletasDAO {

	
	private static  BicicletasDAOImplementation instancia = null;
	  private BicicletasDAOImplementation() {
	  }

	 public static BicicletasDAOImplementation getInstancia() {
	    if( null == instancia )
	      instancia = new BicicletasDAOImplementation();
	    return instancia;
	  }
	
	
	
	
	
	
	
	
	@Override
	public Bicicletas create(Bicicletas usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bicicletas read(Long biciId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bicicletas update(Bicicletas usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bicicletas delete(Bicicletas usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bicicletas> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bicicletas> readAll(String estado) {
		// TODO Auto-generated method stub
		return null;
	}

}
