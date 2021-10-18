package Prototype;

public class CochePrototype extends Coche{
	
	public CochePrototype (String marca,String color,String modelo) {
		
		super(marca , color , modelo);
	}
	@Override
	public CochePrototype clone() {
		
		return new CochePrototype(this.marca,this.color,this.modelo);
	}

}
