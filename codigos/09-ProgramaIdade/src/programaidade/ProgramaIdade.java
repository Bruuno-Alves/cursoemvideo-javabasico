package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o ano do seu nascimento: ");
		int ano = scan.nextInt();
		
		int idade = 2021 - ano;
		
		System.out.print("Voc� tem " + idade + " anos. ");
		
		if (idade >= 18) {
			System.out.println("Voc� � MAIOR de idade.");
		} else {
			System.out.println("Voc� � MENOR de idade.");
		}

	}

}
