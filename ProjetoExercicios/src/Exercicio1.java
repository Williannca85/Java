import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/* 1. Leia um n�mero de 3 d�gitos e gere um novo n�mero composto da invers�o dos 
		d�gitos: Ex: 123 -> 321  */
		
		int numero, novo, unidade, dezena, centena, resto;
		
		System.out.println("Digite o n�mero de tr�s digitos");
		
		numero = teclado.nextInt();
		
		centena = numero/100;
		
		resto = numero % 100;
		
		dezena = resto / 10;
		
		unidade = resto % 10;
		
		novo = unidade * 100 + dezena * 10 + centena;
		
		System.out.println("O novo n�mero �: " + novo);
		
		
	}

}
