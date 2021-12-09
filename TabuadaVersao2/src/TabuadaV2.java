import java.util.Scanner;

public class TabuadaV2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero, resultado;

		System.out.println("Digite o número para calcular a tabuada");

		numero = teclado.nextInt();

		for (int contador = 0; contador <= 10; contador++) {

			resultado = contador * numero;

			System.out.println("O resultado é: " + numero + " x " + resultado);

		}

	}

}
