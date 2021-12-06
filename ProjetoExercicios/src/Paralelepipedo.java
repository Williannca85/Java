import java.util.Scanner;

public class Paralelepipedo {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		/* f. volume de um paralelepípedo, dadas suas dimensões 
		 Volume = altura * largura * profundidade */
		
		int paralelepipedo, altura, largura, profundidade;
		
		System.out.println("Digite a altura");
		
		altura = teclado.nextInt();
		
		System.out.println("Digite a largura");
		
		largura = teclado.nextInt();
		
		System.out.println("Digite a profundidade");
		
		profundidade = teclado.nextInt();
		
		paralelepipedo = altura * largura * profundidade;
		
		System.out.println("A aréa do paralelepipedo é: " + paralelepipedo + " cm²");
		
		/* g. volume de um cubo, dado seu lado 
		 Volume = lado * lado * lado 
		 h. volume de um cilindro, dado seu diâmetro e considerando pi=3,14 
		 Volume = PI * raio * raio * altura */
	}

}
