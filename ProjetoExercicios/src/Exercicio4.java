import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double htrabalhada, qtdhora, inss, liquido, bruto;
		
		System.out.println("Informe o valor da hora trabalhada");
		
		htrabalhada = teclado.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadas");
		
		qtdhora = teclado.nextDouble();
		
		System.out.println("Informe a porcentagem de desconto do INNS");
		
		inss = teclado.nextDouble();
		
		bruto = htrabalhada * qtdhora;
		
		liquido = bruto - (bruto * inss/100);
		
		System.out.println("Valor liquido a receber é R$ " + liquido);
		
	}

}
