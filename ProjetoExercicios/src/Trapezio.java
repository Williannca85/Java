import java.util.Scanner;
public class Trapezio {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		/* e. área de um trapézio, dadas suas bases e sua altura 
		 Área = (base maior + base menor)* altura /2 */
		 
		 int trapezio, maior, menor, altura;
		 
		 System.out.println("Digite valor da base maior");
		 
		 maior = teclado.nextInt();
		 
		 System.out.println("Digite valor da base menor");
		 
		 menor = teclado.nextInt();
		 
		 System.out.println("Digite valor da altura");
		 
		 altura = teclado.nextInt();
		 
		 trapezio = (maior + menor)* altura/2;
		 
		 System.out.println("A aréa do trapézio é: " + trapezio + " cm²");
		 
		 
		
	}

}
