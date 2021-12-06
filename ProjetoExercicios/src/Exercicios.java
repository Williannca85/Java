import java.util.Scanner;

public class Exercicios {
	public static void main(String[] args) {
		/*
		 * 1. Leia um número de 3 dígitos e gere um novo número composto da inversão dos
		 * dígitos: Ex: 123 -> 321
		 */

		/*
		 * 2.Faça programas Java para calcular:
		 * 
		 * a. área de um quadrado, dado seu lado Área = lado * lado
		 */

		Scanner teclado = new Scanner(System.in);

		int quadrado, altura, base;

		System.out.println("Digite a altura");

		altura = teclado.nextInt();

		System.out.println("Digite a base");

		base = teclado.nextInt();

		quadrado = altura * base;

		System.out.println("A area do quadrado é: " + quadrado + " cm².");

		quadrado = teclado.nextInt();

	}

}
