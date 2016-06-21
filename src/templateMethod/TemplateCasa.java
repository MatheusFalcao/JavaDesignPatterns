package templateMethod;

public abstract class TemplateCasa {
	
	//template method, final não pode ser implementado
    public final void buildHouse(){
        contruirFundacao();
        ConstruirPilares();
        ConstruirParedes();
        construirJanelas();
        System.out.println("Casa Construída !");
    }
    
    //Implementação Default
    private void construirJanelas() {
        System.out.println("Construindo Janelas !");
    }
 
    //Metodos que serão implementados pelas subclasses
    public abstract void ConstruirParedes();
    public abstract void ConstruirPilares();
 
    private void contruirFundacao() {
        System.out.println("Construindo fundação");
    }
}
