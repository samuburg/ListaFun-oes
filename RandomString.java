package Funcoes;

import java.util.ArrayList;

public class RandomString {
	
	public static String RandomString (String word) {
	String palavra [] = word.split("");
	StringBuilder RandomWord = new StringBuilder();
	int numero =0;
	int cont = 0;
	ArrayList<Integer> num = new ArrayList();
	int vet [] = new int[word.length()];
	
	
	while (cont<word.length()) {
		numero = (int) (float) (Math.random()*word.length());
		if (num.contains(numero) == false) {
			num.add(numero);
			vet[cont] = numero;
			cont+=1;
		}
	}
	
	for (int x=0;x<word.length();x++) {
		RandomWord.append(palavra[vet[x]]);
	}
	
	
	return RandomWord.toString();
	

}
}
