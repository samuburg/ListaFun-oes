package listaFuncoes;

import java.util.Scanner;

import Funcoes.NVezes;

public class ImprimirNVezes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int num = 0;
		
		System.out.println("Digite um numero: ");
		num = entrada.nextInt();
		System.out.println(NVezes.NVezes(num));
		
		
	}

}
