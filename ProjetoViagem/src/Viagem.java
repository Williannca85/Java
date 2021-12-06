import java.util.Scanner;

public class Viagem {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double velocidade, tempo, distancia, consumo;
		
		System.out.println("Informe o Km/h");
		
		velocidade = teclado.nextDouble();
		
		System.out.println("Informe o tempo utilizado");
		
		tempo = teclado.nextDouble();
		
		distancia = velocidade * tempo;
		
		System.out.println("A distância percorrida foi de: " + distancia + "Km");
		
		consumo = distancia/12;
		
		System.out.println("O consumo total de combustivel foi de: " + consumo + " litros");
		

		
		
		
	}
}
