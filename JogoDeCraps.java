package listaFuncoes;

import Funcoes.JogaDado;

public class JogoDeCraps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int crap = JogaDado.JogaDado()+JogaDado.JogaDado();
		int ponto = 0;
		boolean sit = true;
		
		System.out.println(crap);
		if (crap==7 || crap==11) {
			System.out.println("Você ganhou!!");
		}
		else {
			if (crap==12||crap==2||crap==3) {
				System.out.println("Você perdeu! :(");
			}
			else {
				System.out.println("Agora você precisa tirar o número "+crap+" novamente para ganhar: ");
				ponto = crap;
			
				Thread.sleep(1000);
				System.out.println("Jogando o dado de novo...");
				Thread.sleep(1000);
				
				while (sit==true) {
					ponto = JogaDado.JogaDado()+JogaDado.JogaDado();
					System.out.println(ponto);
					if (ponto==crap) {
						System.out.println("Você ganhou!!");
						sit = false;
					}
					else {
						if (ponto==7) {
							System.out.println("Você perdeu! ");
							sit = false;
						}
						else {
							System.out.println("Jogando de novo...");
							Thread.sleep(2000);
						}
						
					}
					
				}
			}
			
		}
		
		
		


	}

}
