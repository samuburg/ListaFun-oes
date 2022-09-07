package Funcoes;

public class DataEscrita {
	
	public static String DataEscrita(String dia, String mes, String ano) {
		StringBuilder data = new StringBuilder();
		
		data.append(dia +" de "+mes+" de " + ano);
		
		
		return data.toString();
		
		
		
	}

}
