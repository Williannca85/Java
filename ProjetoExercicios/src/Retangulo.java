import java.util.Scanner;

public class Retangulo {
	public static void main(String[] args) {
		/* b. �rea de um ret�ngulo, dados sua base e sua altura 
		 �rea = base * altura */
	
   int retangulo, alt,bas;
	
   Scanner teclado = new Scanner(System.in);
   
	System.out.println("Digite a altura");
	
	alt = teclado.nextInt();
	
	System.out.println("Digite a base");
	
	bas = teclado.nextInt();
	
	retangulo = alt * bas;
	
	System.out.println("A area do ret�ngulo5 �: " + retangulo + " cm�.");
	
	retangulo = teclado.nextInt();

	}

}
