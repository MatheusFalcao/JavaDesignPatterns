package templateMethod;

public abstract class TemplateCasa {
	
	//template method, final n�o pode ser implementado
    public final void buildHouse(){
        contruirFundacao();
        ConstruirPilares();
        ConstruirParedes();
        construirJanelas();
        System.out.println("Casa Constru�da !");
    }
    
    //Implementa��o Default
    private void construirJanelas() {
        System.out.println("Construindo Janelas !");
    }
 
    //Metodos que ser�o implementados pelas subclasses
    public abstract void ConstruirParedes();
    public abstract void ConstruirPilares();
 
    private void contruirFundacao() {
        System.out.println("Construindo funda��o");
    }
}
