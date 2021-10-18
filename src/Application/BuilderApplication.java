package Application;

import Singleton.Singleton;
import Usuario.Usuario;
import Usuario.UsuarioBuilder;

public class BuilderApplication {
	
	public static void main(String[] args) {
		
		Usuario usuario= new UsuarioBuilder().build("Jose", "yosoyjosemanuel@gmail.com", 123456789, "avenida la paz");
		System.out.println(usuario);
		
		Singleton singleton =Singleton.getSingletonUnico("Jose");
		
		Singleton singleton2 =Singleton.getSingletonUnico("Manu");
		
		System.out.println(singleton);
		System.out.println(singleton2);
		
	}

}
