

/*Enunciado - Fa�a um programa Java que calcule o consumo m�dio de um carro durante a viagem. Ser�o informados a dist�ncia percorrida e a quantidade de litros
de combust�vel gastos. O consumo m�dio � dado pela dist�ncia dividido pelo consumo total.
Ao final exiba este valor. */

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		double km, litros, media;
		
		System.out.println("Digite a dist�ncia percorrida");
		
		km = teclado.nextDouble();
		
		System.out.println("Digite a quantidade de combustivel");
		
		litros = teclado.nextDouble();
		
		media =  km/litros;
		
		System.out.println("O seu consumo m�dio foi:  " + media);
		
		media = teclado.nextDouble();
	}
}
