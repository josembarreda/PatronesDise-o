package Application;

import CircuitBreaker.CircuitBreaker;
import Prototype.CochePrototype;
import Retry.Retry;
import Singleton.Singleton;
import Usuario.Usuario;
import Usuario.UsuarioBuilder;

public class BuilderApplication {
	
	public static void main(String[] args) {
	
		
		//Builder
		System.out.println("EJEMPLO DEL PATRON BUILDER\n");
		Usuario usuario= new UsuarioBuilder().build("Jose", "yosoyjosemanuel@gmail.com", 123456789, "avenida la paz");
		System.out.println(usuario);
		System.out.println("\n--------------------------\n");
		
		
		//Singleton
		System.out.println("EJEMPLO DEL PATRON SINGLETON\n");
		Singleton singleton =Singleton.getSingletonUnico("Jose");
		
		Singleton singleton2 =Singleton.getSingletonUnico("Manu");
		
		System.out.println(singleton);
		System.out.println(singleton2);
		System.out.println("\n--------------------------\n");
		
		//Prototype
		System.out.println("EJEMPLO DEL PATRON PROTOTYPE\n");
		CochePrototype coche = new CochePrototype("audi","rojo","r8");
		CochePrototype coche2 = coche.clone();
		System.out.println(coche);
		System.out.println(coche2);
		System.out.println("\n--------------------------\n");
		
		//Retry
		System.out.println("EJEMPLO DEL PATRON RETRY\n");
		Retry retry = new Retry();
		int i =0;
		while(i <= 2) {
			retry.comprobar(coche);
			if(i == 1) {
				coche.setColor("blanco");
			}
			i++;
		}
		System.out.println("\n--------------------------\n");
		
		//CircuitBreaker
		System.out.println("EJEMPLO DEL PATRON CIRCUITBREAKER\n");
		CircuitBreaker estados= new CircuitBreaker();
		
		
		for(int c =0;c<=5;c++) {
			if(c==0) {
				estados.comprobarEstado(coche);
			}
			else if(c==1) {
				coche.setMarca("");
				coche.setColor("");
				coche.setModelo("");
				estados.comprobarEstado(coche);
			}
			else if(c==2) {
				coche.setMarca("porsche");
				coche.setColor("azul");
				coche.setModelo("cayman");
				estados.comprobarEstado(coche);
			}
			else if(c==3) {
				coche.setMarca("audi");
				coche.setColor("verde");
				coche.setModelo("r8");
				estados.comprobarEstado(coche);
			}
			else if(c==4) {
				coche.setMarca("");
				coche.setColor("blanco");
				coche.setModelo("");
				estados.comprobarEstado(coche);
			}
			
		}
		System.out.println("\n--------------------------\n");
		
		
		
		/*
		
		
		for(int i =0; i< 7;i++) {
			
		}*/
	}

}
