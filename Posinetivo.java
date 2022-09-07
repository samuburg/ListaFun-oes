package Funcoes;

public class Posinetivo {
	
	public static String Posinetivo(int num) {
		StringBuilder saida  = new StringBuilder();
		
		if (num>0) {
			saida.append("P");
		}
		else {
			saida.append("N");
		}
		
		return saida.toString();
		
		
		
		
	}

	
	

}
