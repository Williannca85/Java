import java.util.Scanner;

public class Retangulo {
	public static void main(String[] args) {
		/* b. área de um retângulo, dados sua base e sua altura 
		 Área = base * altura */
	
   int retangulo, alt,bas;
	
   Scanner teclado = new Scanner(System.in);
   
	System.out.println("Digite a altura");
	
	alt = teclado.nextInt();
	
	System.out.println("Digite a base");
	
	bas = teclado.nextInt();
	
	retangulo = alt * bas;
	
	System.out.println("A area do retângulo5 é: " + retangulo + " cm².");
	
	retangulo = teclado.nextInt();

	}

}
