package Observer;

import java.util.Scanner;

public class Run {

	private static Scanner scan;

	public static void main(String[] args) {
		Sujeito objetoDeDados = new Sujeito();
		//criando observadores
		
		new HexObserver (objetoDeDados);
		new BinObserver (objetoDeDados);
		
		scan = new Scanner(System.in);
		while(true){
			System.out.println("\nEntre com um número: ");
			objetoDeDados.setEstado(scan.nextInt());
		}

	}

}
