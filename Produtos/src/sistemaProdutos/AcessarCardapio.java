package sistemaProdutos;

import java.util.Scanner;

public class AcessarCardapio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		//CALCULAR PRODUTOS COM BASE NO CODIGO 
		
		double cachorroQuente = 4.0;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double TorradaSimples = 2.00;
		double refrigerante = 1.50;
		
		int codigo;
		int quantidade;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		double total = 0;
		
		if(codigo == 1) {
			total = cachorroQuente * quantidade;
		
		}else if(codigo == 2) {
			total = xSalada * quantidade;
		
		}else if(codigo == 3) {
			total = xBacon * quantidade;
		
		}else if(codigo == 4) {
			total = TorradaSimples * quantidade;
		
		}else if(codigo == 5) {
			total = refrigerante * quantidade;
		}
			
		System.out.printf("Total %.2f%n", total);
		
		sc.close();
		
	}

}
