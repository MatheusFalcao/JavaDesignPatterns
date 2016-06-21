package Observer;
public class HexObserver extends Observer {
	public HexObserver (Sujeito s){
		objetoDeDados = s;
		objetoDeDados.adicionarObservador(this);
	}
	public void atualizar(){
	System.out.println(" " + Integer.toHexString(objetoDeDados.getEstado()));
	}
}
