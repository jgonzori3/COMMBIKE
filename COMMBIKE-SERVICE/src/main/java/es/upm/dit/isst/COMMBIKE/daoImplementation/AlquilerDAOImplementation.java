package es.upm.dit.isst.COMMBIKE.daoImplementation;

import java.sql.Date;
import java.util.List;

import es.upm.dit.isst.COMMBIKE.dao.AlquilerDAO;
import es.upm.dit.isst.COMMBIKE.model.Alquiler;

public class AlquilerDAOImplementation implements AlquilerDAO {

	private static  AlquilerDAOImplementation instancia = null;
	  private AlquilerDAOImplementation() {
	  }

	 public static AlquilerDAOImplementation getInstancia() {
	    if( null == instancia )
	      instancia = new AlquilerDAOImplementation();
	    return instancia;
	  }
	
	
	
	@Override
	public Alquiler create(Alquiler usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alquiler read(Long userId, Long biciId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alquiler update(Alquiler usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alquiler delete(Alquiler usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alquiler> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alquiler> readAll(Date horaInicio, Date horaFin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Alquiler> readAll(Date hora) {
		// TODO Auto-generated method stub
		return null;
	}

}
