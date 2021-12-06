import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/* 1. Leia um número de 3 dígitos e gere um novo número composto da inversão dos 
		dígitos: Ex: 123 -> 321  */
		
		int numero, novo, unidade, dezena, centena, resto;
		
		System.out.println("Digite o número de três digitos");
		
		numero = teclado.nextInt();
		
		centena = numero/100;
		
		resto = numero % 100;
		
		dezena = resto / 10;
		
		unidade = resto % 10;
		
		novo = unidade * 100 + dezena * 10 + centena;
		
		System.out.println("O novo número é: " + novo);
		
		
	}

}
