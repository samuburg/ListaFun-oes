package listaFuncoes;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import Funcoes.DataEscrita;
import Funcoes.MesPorExtenso;

public class DataComMesPorExtenso {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		String data = "";
		String mes = "";
		
		System.out.println("Digite uma data no formato dd/mm/aaaa ");
		data = entrada.next();
	
		
		String vet [] = data.split("/");
		
		for (int x=0; x<vet.length;x++) {
			mes = vet[1];
		}

		
		System.out.println(DataEscrita.DataEscrita(vet[0], MesPorExtenso.MesEscrito(mes), vet[2]));
		
		
	
					
	
		

	}

}
