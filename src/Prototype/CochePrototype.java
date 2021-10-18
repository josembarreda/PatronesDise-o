package Prototype;

public class CochePrototype extends Coche{
	
	public CochePrototype (String carroceria, String motor,String ruedas,String aceite) {
		
		super(carroceria , motor , ruedas,aceite);
	}
	@Override
	public CochePrototype clone() {
		
		return new CochePrototype(this.carroceria,this.motor,this.ruedas,this.aceite);
	}

}
