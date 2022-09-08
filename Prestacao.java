package listaFuncoes;

import java.util.Scanner;

import Funcoes.ValorPagamento;

public class Prestacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		float prestacao= 0;
		int dias = 0;
		
		System.out.println("Digite o valor da prestação: ");
		prestacao = entrada.nextFloat();
		System.out.println("Digite o numero de dias em atraso: ");
		dias = entrada.nextInt();
		System.out.println(ValorPagamento.valorPagamento(prestacao,dias));
		
		
	}

	}

