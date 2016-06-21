package decorator;

//DECORATOR
public class CarroDecorator implements Carro {

	protected Carro carro;
	
	public CarroDecorator(Carro c){
		this.carro = c;
	}
	
	public void montarCarro(){
		this.carro.montarCarro();
	}
}
