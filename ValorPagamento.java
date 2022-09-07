package Funcoes;

public class ValorPagamento {
	public static float valorPagamento(float presta , int dia) {
		float total = 0;
		
		if (dia ==0) {
			total = presta;
		}
		else {
			total = (float) ((float) (presta*0.03)+ (0.001*dia *presta)+presta);
	
		}
		
		return total;

}
}
