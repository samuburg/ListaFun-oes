package listaFuncoes;

import java.util.Scanner;

import Funcoes.ConverteParaPM;

public class ConverteHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		int hora = 0;
		int minuto = 0;
		String continua = "";
		
		
		
		do {
			do {
				System.out.println("Digite a hora no formato 24h ");
				hora = entrada.nextInt();
			} while (hora>23);
			
			do {
				System.out.println("Agora digite os minutos ");
				minuto = entrada.nextInt();
			} while (minuto>60);
			
			System.out.println(ConverteParaPM.ConverteHora(hora, minuto));
			
			
			System.out.println("Deseja continuar? S/N");
			continua = entrada.next().toUpperCase();
	
				
				
		} while (continua.equals("S"));
				

	}

}
