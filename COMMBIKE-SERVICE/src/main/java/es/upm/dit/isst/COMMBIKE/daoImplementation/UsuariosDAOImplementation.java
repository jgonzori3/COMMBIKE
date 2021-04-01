package es.upm.dit.isst.COMMBIKE.daoImplementation;

import java.io.IOException;
import java.util.List;

import javax.websocket.Session;

import es.upm.dit.isst.COMMBIKE.dao.SessionFactoryService;
import es.upm.dit.isst.COMMBIKE.dao.UsuariosDAO;
import es.upm.dit.isst.COMMBIKE.model.Usuarios;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.cfg.Configuration;

public class UsuariosDAOImplementation implements UsuariosDAO {

	
	private static  UsuariosDAOImplementation instancia = null;
	  private UsuariosDAOImplementation() {
	  }

	 public static UsuariosDAOImplementation getInstancia() {
	    if( null == instancia )
	      instancia = new UsuariosDAOImplementation();
	    return instancia;
	  }
	
	
	
	
	@Override
	public Usuarios create(Usuarios usuario) throws IOException {
		// TODO Auto-generated method stub
		Session session = (Session) SessionFactoryService.get().openSession();
		((SharedSessionContract) session).beginTransaction();
		Usuarios user = null;
		 // operaciones
		try {
			((org.hibernate.Session) session).save(usuario);
			user=usuario;
		} catch (Exception e) {
			// TODO: handle exception
		}
		((SharedSessionContract) session).getTransaction().commit();
		session.close();
		return (Usuarios) user;
		
	}

	@Override
	public Usuarios read(String correo, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios update(Usuarios usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuarios delete(Usuarios usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuarios> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuarios> readAll(String contraseña, String tarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuarios> readAll(String contraseñaOtarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

}
