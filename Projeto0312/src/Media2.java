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
		
		System.out.println("A sua m�dia foi: " + media);
		 
		if(media >= 8 && media <= 10) {
			
			System.out.println("Voc� foi aprovado com louvor");
		} 
		
		else if (media >= 6 && media < 8) {
			
			System.out.println("Voc� foi aprovado");
		}
		
		else if (media >= 5 && media < 6) {
			
			System.out.println("Voc� est� em recupera��o");	
		}
		
		else {
		
		System.out.println("Voc� foi reprovado");
		
		}
			/* Se a nota n�o estiver na condi��o acima, o aluno est� reprovado (ex: m�dia 12)*/
	}
}

