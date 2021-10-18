package CircuitBreaker;

import Prototype.CochePrototype;

public class CircuitBreaker {
	
	public void comprobarEstado(CochePrototype coche) {
		if (coche.getMarca() == "" && coche.getColor() == "" && coche.getModelo() == "") {
			System.out.println("ESTADO: DISABLED");
		}
		else if (coche.getMarca() != "audi" && coche.getMarca() != "" && coche.getColor() != "blanco" && coche.getColor() != "" && coche.getModelo() != "r8" && coche.getModelo() != "") {
			System.out.println("ESTADO: CLOSED");
		}
		else if (coche.getMarca() == "audi" && coche.getColor() != "blanco" && coche.getModelo() == "r8") {
			System.out.println("ESTADO: HALF OPEN");
		}
		else if (coche.getMarca() == "" && coche.getColor() == "blanco" && coche.getModelo() == "") {
			System.out.println("ESTADO: FORCED OPEN");
		}
		else if(coche.getMarca() == "audi" && coche.getColor() == "blanco" && coche.getModelo() == "r8") {
			System.out.println("ESTADO: OPEN");
		}
		
	}

}
