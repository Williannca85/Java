import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		
		/* c. �rea de um tri�ngulo, dados sua base e sua altura 
3		 �rea = (base * altura)/2 */
		
		int triangulo, altura,base;
		
		   Scanner teclado = new Scanner(System.in);
		   
			System.out.println("Digite a altura");
			
			altura = teclado.nextInt();
			
			System.out.println("Digite a base");
			
			base = teclado.nextInt();
			
			triangulo = (altura * base)/2;
			
			System.out.println("A area do tri�ngulo �: " + triangulo + " cm�.");
			
			triangulo = teclado.nextInt();

		
	}
}
