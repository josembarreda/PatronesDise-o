package Prototype;

public abstract class Coche {
	
	protected String carroceria;
	protected String motor;
	protected String ruedas;
	protected String aceite;
	
	public Coche(String carroceria, String motor,String ruedas,String aceite) {
		this.setCarroceria(carroceria);
		this.setMotor(motor);
		this.setRuedas(ruedas);
		this.setAceite(aceite);
		
	}

		
	@Override
	public String toString() {
		return "Coche [carroceria=" + carroceria + ", motor=" + motor + ", ruedas=" + ruedas + ", aceite=" + aceite
				+ "]";
	}


	public String getCarroceria() {
		return carroceria;
	}


	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}


	public String getMotor() {
		return motor;
	}


	public void setMotor(String motor) {
		this.motor = motor;
	}


	public String getRuedas() {
		return ruedas;
	}


	public void setRuedas(String ruedas) {
		this.ruedas = ruedas;
	}


	public String getAceite() {
		return aceite;
	}


	public void setAceite(String aceite) {
		this.aceite = aceite;
	}


	public abstract Coche clone();

}
