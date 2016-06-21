package decorator;

//CONCRETE DECORATOR
public class CarroEsporte extends CarroDecorator {

	public CarroEsporte(Carro c){
		super(c);
	}
	
	public void montarCarro(){
		super.montarCarro();
		System.out.println("Carro Esporte Montado !");
	}
}
