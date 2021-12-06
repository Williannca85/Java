

/*Enunciado - Faça um programa Java que calcule o consumo médio de um carro durante a viagem. Serão informados a distância percorrida e a quantidade de litros
de combustível gastos. O consumo médio é dado pela distância dividido pelo consumo total.
Ao final exiba este valor. */

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		double km, litros, media;
		
		System.out.println("Digite a distância percorrida");
		
		km = teclado.nextDouble();
		
		System.out.println("Digite a quantidade de combustivel");
		
		litros = teclado.nextDouble();
		
		media =  km/litros;
		
		System.out.println("O seu consumo médio foi:  " + media);
		
		media = teclado.nextDouble();
	}
}
