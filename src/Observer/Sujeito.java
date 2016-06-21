package Observer;

import java.util.List;
import java.util.ArrayList;

public class Sujeito {
	private List<Observer> observadores = new ArrayList<Observer>();
	private int estado;
	
	public void adicionarObservador(Observer o){
		observadores.add(o);
	}
	
	public int getEstado(){
		return estado;
	}
	
	public void setEstado(int in){
		estado = in;
		notificar();
	}
	
	private void notificar(){
		for (Observer o : observadores){
			o.atualizar();
		}
	}
}
