import java.util.Scanner;

public class Exercicios {
	public static void main(String[] args) {
		/*
		 * 1. Leia um n�mero de 3 d�gitos e gere um novo n�mero composto da invers�o dos
		 * d�gitos: Ex: 123 -> 321
		 */

		/*
		 * 2.Fa�a programas Java para calcular:
		 * 
		 * a. �rea de um quadrado, dado seu lado �rea = lado * lado
		 */

		Scanner teclado = new Scanner(System.in);

		int quadrado, altura, base;

		System.out.println("Digite a altura");

		altura = teclado.nextInt();

		System.out.println("Digite a base");

		base = teclado.nextInt();

		quadrado = altura * base;

		System.out.println("A area do quadrado �: " + quadrado + " cm�.");

		quadrado = teclado.nextInt();

	}

}
