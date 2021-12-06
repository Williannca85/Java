import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/* 3. Sabendo que o valor de 100 kw corresponde a 1/7 do valor do salário mínimo, faça 
		um programa Java que receba o valor do salário mínimo e a quantidade de kw gasta 
		por uma residência e calcule: 
 			a. o valor em reais de cada kw. 
 			b. o valor em reais a ser pago 
 			c. o novo valor a ser pago por essa residência com um desconto de 10% */
	
		double salario, energia, preco, vp, vd;
		
		System.out.println("Digite o valor do Salario Minimo: R$ ");
		
		salario = teclado.nextDouble();
		
		System.out.println("Quantidade de energia em Kw/h usado");
		
		energia = teclado.nextDouble();
		
		preco = (salario/7)/100;
		
		System.out.println("O valor do Kw/h é R$ " + preco);
		
		vp = preco * energia;
		
		System.out.println("O valor pago foi R$ " + vp);
		
		vd = vp * 0.9; /* noventa porcento do valor total */
		
		System.out.println("O valor do desconto foi R$ " + vd);
		
	}

}
