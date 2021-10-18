package Singleton;

public class Singleton {
	
	@Override
	public String toString() {
		return "Singleton [nombre=" + nombre + "]";
	}

	private String nombre;
	private static Singleton soyUnico;
	
	public Singleton(String nombre) {
		this.nombre=nombre;
		System.out.println("Mi nombre es"+ this.nombre);;
	}
	
	public static Singleton getSingletonUnico(String nombre) {
		
		if (soyUnico == null) {
			soyUnico= new Singleton(nombre);
		}
		else {
			System.out.println("Objeto ya existente");
		}
		return soyUnico;
		 
	}

}