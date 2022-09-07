package Funcoes;

public class UntilN {
	public static String UntilN(int num) {
		StringBuilder saida  = new StringBuilder();
		
		for (int x=0;x<=num;x++) {
			saida.append("\n");
			for (int i=0;i<x;i++) {
				saida.append((i+1) + " | ");
			}	
		}
		
		return saida.toString();
		
		
		
		
	}
	
	
	

}
