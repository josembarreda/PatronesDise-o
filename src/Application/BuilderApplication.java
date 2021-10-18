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
		//Clonacion del objeto coche mediante el patron prototype.
		System.out.println("EJEMPLO DEL PATRON PROTOTYPE\n");
		CochePrototype coche = new CochePrototype("BIEN","FALLO","BIEN","BIEN");
		CochePrototype coche2 = coche.clone();
		System.out.println(coche);
		System.out.println(coche2);
		System.out.println("\n--------------------------\n");
		
		//Retry
		//En este ejemplo se quiere representar que si el coche tiene cualquier fallo no podrá ser usado por mínimo que sea.
		System.out.println("EJEMPLO DEL PATRON RETRY\n");
		Retry retry = new Retry();
		int i =0;
		while(i <= 2) {
			retry.comprobar(coche);
			if(i == 1) {
				//El valor del parametro Motor se cambia a BIEN para que se muestre la aprobación de que puede ser usado.
				coche.setMotor("BIEN");
			}
			i++;
		}
		System.out.println("\n--------------------------\n");
		
		//CircuitBreaker
		System.out.println("EJEMPLO DEL PATRON CIRCUITBREAKER\n");
		CircuitBreaker estados= new CircuitBreaker();
		
		coche.setMotor("FALLO");
		for(int c =0;c<=5;c++) {
			if(c==0) {
				//El coche esta bien fisicamente pero su motor tiene un fallo y no arranca , se muestra estado 'closed'.
				estados.comprobarEstado(coche);
			}
			else if(c==1) {
				//El coche esta en perfecto estado , se muestra estado 'open'.
				coche.setCarroceria("BIEN");
				coche.setMotor("BIEN");
				coche.setRuedas("BIEN");
				coche.setAceite("BIEN");
				estados.comprobarEstado(coche);
			}
			else if(c==2) {
				//El coche tiene fallos en la carroceria debido a un golpe y como consecuencia ha perdido un poco de aceite
				// por lo que se puede conducir pero hay un poco de riesgo de averia, se muestra estado 'half-open'.
				coche.setCarroceria("FALLO");
				coche.setMotor("BIEN");
				coche.setRuedas("BIEN");
				coche.setAceite("FALLO");
				estados.comprobarEstado(coche);
			}
			else if(c==3) {
				//Por la antiguedad del coche el filtro de aceite falla y esta perdiendo mucho aceite, tiene problemas en el motor y además un rueda
				//ha sufrido un pinchazo por el desgaste , se puede conducir pero hay mucho riesgo de averia , se muestra estado 'forced-open'.
				coche.setCarroceria("BIEN");
				coche.setMotor("FALLO");
				coche.setRuedas("FALLO");
				coche.setAceite("FALLO");
				estados.comprobarEstado(coche);
			}
			else if(c==4) {
				//El coche ha sufrido un grave accidente y tiene fallos graves tanto en su carroceria , motor , ruedas y aceite por lo que
				//esta en el taller , imposible conducirlo, se muestra estado 'disabled'.
				coche.setCarroceria("FALLO");
				coche.setMotor("FALLO");
				coche.setRuedas("FALLO");
				coche.setAceite("FALLO");
				estados.comprobarEstado(coche);
			}
			
		}
		System.out.println("\n--------------------------\n");
		
		
		
		/*
		
		
		for(int i =0; i< 7;i++) {
			
		}*/
	}

}
