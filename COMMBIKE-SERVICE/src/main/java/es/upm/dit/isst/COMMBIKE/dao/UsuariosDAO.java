package es.upm.dit.isst.COMMBIKE.dao;
import java.io.IOException;
import java.util.List;

import es.upm.dit.isst.COMMBIKE.model.Usuarios;;

public interface UsuariosDAO {
	
	public Usuarios create(Usuarios usuario) throws IOException;
	public Usuarios read(String correo,Long userId);
	public Usuarios update(Usuarios usuario);
	public Usuarios delete(Usuarios usuario);
	public List<Usuarios> readAll();
	public List<Usuarios> readAll(String contraseña,String tarjeta);
	public List<Usuarios> readAll(String contraseñaOtarjeta);
	
}
