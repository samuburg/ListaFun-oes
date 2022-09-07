package Funcoes;

public class ConverteParaPM {

	public static String horaPM (int num) {
		
		StringBuilder hConvertido = new StringBuilder();
		
		if (num>=12) {
			hConvertido.append("PM "+(num-12));
		}
		else {
			hConvertido.append("AM "+ num);
		}
		
		return hConvertido.toString();

	}
	
	public static String ConverteHora (int hora, int minuto) {
		StringBuilder saida = new StringBuilder();

		
		saida.append(horaPM(hora) + "h:" + minuto + "min");
		
		return saida.toString();
	}
	
	

}
