package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		float n1 = scan.nextFloat();
		
		System.out.print("Informe a segunda nota: ");
		float n2 = scan.nextFloat();
		
		float m = (n1 + n2) / 2;
		
		System.out.print("Sua nota foi " + m + ". ");
		
		if (m > 9) {
			System.out.println("PARABÉNS!");
		}
		

	}

}
