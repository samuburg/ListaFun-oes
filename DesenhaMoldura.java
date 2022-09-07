package Funcoes;

public class DesenhaMoldura {

	public static String DesenhaMoldura(int lin, int col) {
		StringBuilder saida  = new StringBuilder();
		StringBuilder coluna = new StringBuilder();
		
		
		for (int x=0; x<=col;x++) {
			coluna.append("  ");
		}

		
		for (int x=0;x<=lin;x++) {
			if (x==0) {
				for (int i=0; i<=col+1;i++) {
					saida.append("__");
				}
			}
			if (x>0 && x<=lin+1) {
				saida.append("\n|"+coluna+"|");
			}
				
				
				
				
				
			if (x==lin) {
				saida.append("\n");
				saida.append("|");
				for (int i=1; i<=col+1;i++) {
					saida.append("__");
				}
				saida.append("|");
				}
				
			}
				
		
		
		
		return saida.toString();
		
		
	}
		
		
	
}

