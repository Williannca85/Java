import java.util.Scanner;

public class Media2 {

	public static void main(String[] args) { 
		
		Scanner teclado = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite o nota 1");
		
		nota1 = teclado.nextDouble();
		
		System.out.println("Digite a nota 2");
		
		nota2 = teclado.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		System.out.println("A sua média foi: " + media);
		 
		if(media >= 8 && media <= 10) {
			
			System.out.println("Você foi aprovado com louvor");
		} 
		
		else if (media >= 6 && media < 8) {
			
			System.out.println("Você foi aprovado");
		}
		
		else if (media >= 5 && media < 6) {
			
			System.out.println("Você está em recuperação");	
		}
		
		else {
		
		System.out.println("Você foi reprovado");
		
		}
			/* Se a nota não estiver na condição acima, o aluno está reprovado (ex: média 12)*/
	}
}

