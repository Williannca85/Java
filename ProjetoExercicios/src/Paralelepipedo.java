import java.util.Scanner;

public class Paralelepipedo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		/* f. volume de um paralelep�pedo, dadas suas dimens�es 
		 Volume = altura * largura * profundidade */
		
		int paralelepipedo, altura, largura, profundidade;
		
		System.out.println("Digite a altura");
		
		altura = teclado.nextInt();
		
		System.out.println("Digite a largura");
		
		largura = teclado.nextInt();
		
		System.out.println("Digite a profundidade");
		
		profundidade = teclado.nextInt();
		
		paralelepipedo = altura * largura * profundidade;
		
		System.out.println("A ar�a do paralelepipedo �: " + paralelepipedo + " cm�");
		
		/* g. volume de um cubo, dado seu lado 
		 Volume = lado * lado * lado 
		 h. volume de um cilindro, dado seu di�metro e considerando pi=3,14 
		 Volume = PI * raio * raio * altura */
	}

}
