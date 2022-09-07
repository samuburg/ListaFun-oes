package Funcoes;

import java.util.Scanner;

public class ReverseNum {

	public static String ReverseNum(int num) {
		String numString = ""+num+"";
		String vet [] = numString.split("");
		StringBuilder saida = new StringBuilder();
		
		for (int x=numString.length()-1;x>=0;x--) {
			saida.append(vet[x]);
		}
		
		return saida.toString();

	}

}
