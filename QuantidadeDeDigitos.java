package listaFuncoes;

import java.util.Scanner;

import Funcoes.IntLength;

public class QuantidadeDeDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		int num = 0;
		
		System.out.println("Digite um numero: ");
		num = entrada.nextInt();
		
		System.out.println("Este número possui "+IntLength.IntLength(num)+ " digitos");
		
		
	}

	

}
