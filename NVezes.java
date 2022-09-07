package Funcoes;

public class NVezes {
	public static String NVezes(int num) {
		StringBuilder saida  = new StringBuilder();
		
		for (int x=0;x<=num;x++) {
			saida.append("\n");
			for (int i=0;i<x;i++) {
				saida.append(x + "| ");
			}	
		}
		
		return saida.toString();
		
		
		
		
	}
	
	

}
