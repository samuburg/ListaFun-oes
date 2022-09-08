package listaFuncoes;

import java.util.Scanner;

import Funcoes.UntilN;

public class ImprimirAteN {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int num = 0;
			
		System.out.println("Digite um numero: ");
		num = entrada.nextInt();
		System.out.println(UntilN.UntilN(num));
			
			
		}
		
		
		



}
