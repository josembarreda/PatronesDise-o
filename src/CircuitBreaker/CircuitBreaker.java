package CircuitBreaker;

import Prototype.CochePrototype;

public class CircuitBreaker {
	
	public void comprobarEstado(CochePrototype coche) {
		if (coche.getCarroceria() == "BIEN" && coche.getMotor() == "FALLO" && coche.getRuedas() == "BIEN" && coche.getAceite() == "BIEN") {
			System.out.println("ESTADO: CLOSED");
		}
		else if (coche.getCarroceria() == "BIEN" && coche.getMotor() == "BIEN" && coche.getRuedas() == "BIEN" && coche.getAceite() == "BIEN") {
			System.out.println("ESTADO: OPEN");
		}
		else if (coche.getCarroceria() == "FALLO" && coche.getMotor() == "BIEN" && coche.getRuedas() == "BIEN" && coche.getAceite() == "FALLO") {
			System.out.println("ESTADO: HALF OPEN");
		}
		else if (coche.getCarroceria() == "BIEN" && coche.getMotor() == "FALLO" && coche.getRuedas() == "FALLO" && coche.getAceite() == "FALLO") {
			System.out.println("ESTADO: FORCED OPEN");
		}
		else if(coche.getCarroceria() == "FALLO" && coche.getMotor() == "FALLO" && coche.getRuedas() == "FALLO" && coche.getAceite() == "FALLO") {
			System.out.println("ESTADO: DISABLED");
		}
		
	}

}
