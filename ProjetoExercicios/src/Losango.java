import java.util.Scanner;

public class Losango {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/* d. área de um losango, dadas suas diagonais 
		 Área = diagonal1 * diagonal2 */
		
		int losango, d1,d2;
		
		System.out.println("Digite a diagonal 1");
		
		d1 = teclado.nextInt();
		
		System.out.println("Digite a diagonal 2");
		
		d2 = teclado.nextInt();
		
		losango = (d1 * d2)/2;
		
		System.out.println("A area do losango é: " + losango + " cm².");
		
		losango = teclado.nextInt();

	}
}
