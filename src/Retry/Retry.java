package Retry;

import Prototype.CochePrototype;

public class Retry {
	
	public void comprobar(CochePrototype coche) {
		if (coche.getCarroceria() == "BIEN" && coche.getMotor() == "BIEN" && coche.getRuedas() == "BIEN" && coche.getAceite() == "BIEN") {
			System.out.println("ESTADO: CORRECTO");
		}
		else {
			System.out.println("ESTADO: REINTENTO");
		}
		
	}

}
