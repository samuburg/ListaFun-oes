package listaFuncoes;

import java.util.Scanner;

import Funcoes.ReverseNum;

public class InversoDoNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int num = 0;
		
		System.out.println("Digite um número inteiro positivo: ");
		num = entrada.nextInt();
		
		System.out.println(ReverseNum.ReverseNum(num));
		

	}

}
