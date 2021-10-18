package Usuario;

public class UsuarioBuilder {
	
	public Usuario build(String nombre, String direccion, int telefono, String gmail) {
		
		Usuario user = new Usuario(nombre,direccion,telefono,gmail);
		
		return user;
		
	}

}
