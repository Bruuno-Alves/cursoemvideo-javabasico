import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o nome do aluno: ");
		String nome = teclado.nextLine();
		
		System.out.print("Informe a nota do aluno: ");
		float nota = teclado.nextFloat();
		
		System.out.format("A nota de %s é %.2f.", nome, nota);
		

	}

}
