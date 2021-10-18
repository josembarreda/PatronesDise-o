package Retry;

import Prototype.CochePrototype;

public class Retry {
	
	public void comprobar(CochePrototype coche) {
		if (coche.getMarca() == "audi" && coche.getColor() == "blanco" && coche.getModelo() == "r8") {
			System.out.println("ESTADO: CORRECTO");
		}
		else {
			System.out.println("ESTADO: REINTENTO");
		}
		
	}

}
