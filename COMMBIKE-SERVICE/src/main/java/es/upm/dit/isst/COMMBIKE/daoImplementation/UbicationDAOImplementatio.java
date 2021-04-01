package es.upm.dit.isst.COMMBIKE.daoImplementation;

import java.util.List;

import es.upm.dit.isst.COMMBIKE.dao.UbicacionesDAO;
import es.upm.dit.isst.COMMBIKE.model.Ubicaciones;

public class UbicationDAOImplementatio implements UbicacionesDAO {

	private static  UbicationDAOImplementatio instancia = null;
	  private UbicationDAOImplementatio() {
	  }

	 public static UbicationDAOImplementatio getInstancia() {
	    if( null == instancia )
	      instancia = new UbicationDAOImplementatio();
	    return instancia;
	  }
	
	
	
	@Override
	public Ubicaciones create(Ubicaciones usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ubicaciones read(Long userId, Long biciId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ubicaciones update(Ubicaciones usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ubicaciones delete(Ubicaciones usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ubicaciones> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ubicaciones> readAll(String ubicacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
