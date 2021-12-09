import java.util.Scanner;

public class TabuadaV1 {

	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero, contador, resultado;
		
		System.out.println("Tabuada do ");
		
		numero = teclado.nextInt();
		
		contador = 0;
		
		while(contador <= 10) {
			
			resultado = numero * contador;
			
			System.out.println(numero + "x" + contador + "=" + resultado);
			
			contador++;
			
			
		}
		
	}
}
