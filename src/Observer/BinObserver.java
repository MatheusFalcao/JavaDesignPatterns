package Observer;
public class BinObserver extends Observer {
	public BinObserver (Sujeito s){
		objetoDeDados = s;
		objetoDeDados.adicionarObservador(this);
	}
	public void atualizar(){
	System.out.println(" " + Integer.toBinaryString(objetoDeDados.getEstado()));
	}
}
