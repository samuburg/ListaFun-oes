package listaFuncoes;

import java.util.Scanner;

import Funcoes.RandomString;

public class PalavraEmbaralhada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		String palavra = "";
		
		System.out.println("Digite uma palavra: ");
		palavra = entrada.next();
		
		System.out.println("Palavra embaralhada: ");
		System.out.println(RandomString.RandomString(palavra));

	}

}
