package decorator;

//CONCRETE DECORATOR
public class CarroLuxo extends CarroDecorator {
	
	public CarroLuxo(Carro c){
		super(c);
	}
	
	public void montarCarro(){
		super.montarCarro();
		System.out.println("Carro de Luxo Montado !");
	}
}
