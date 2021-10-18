package Prototype;

public abstract class Coche {
	
	protected String marca;
	protected String color;
	protected String modelo;
	
	public Coche(String marca, String color,String modelo) {
		this.setMarca(marca);
		this.setColor(color);
		this.setModelo(modelo);
		
	}
	
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", color=" + color + ", modelo=" + modelo + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

		
	public abstract Coche clone();

}
