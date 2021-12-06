import java.util.Scanner;

public class TestEntrada {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite um valor numerico");
		
		valor = teclado.nextInt();
		
		System.out.println("Você digitou: " + valor);
	}

} 