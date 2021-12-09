import nucleo.Funcionario;

public class FolhaDePagamento {

	public static void main(String[] args) {

		Funcionario f1, f2, f3;

		/*f1 = new Funcionario();

		f2 = new Funcionario();
		
		f3 = new Funcionario();
		

		f1.setNumeroFuncional (1234);	
		f1.setNome ("Willian");		
		f1.setCargo ("Gerente");
		f1.setSalario (3500.00);*/
		
		
		f1 = new Funcionario(1234, "Willian", "Gerente", 7500.00);
		f2 = new Funcionario(2345, "Aline", "Analista", 5500.00);
		f3 = new Funcionario(3456, "Vitor", "Assistente", 2200.00);
		
		f1.mostrarDados();
		f2.mostrarDados();
		f3.mostrarDados(); 
		f1.aumentarSalario(5);
		f1.mostrarDados();
		f2.aumentarSalario(5);
		f2.mostrarDados();
		f3.aumentarSalario(5);
		f3.mostrarDados();

	}

}
