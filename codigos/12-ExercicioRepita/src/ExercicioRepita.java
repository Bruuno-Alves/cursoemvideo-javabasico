
import javax.swing.JOptionPane;

public class ExercicioRepita {

	public static void main(String[] args) {
		
		int numero = 0;
		int soma = 0;
		int total = 0;
		int pares = 0;
		int impares = 0;
		int acima = 0;
		float media = 0f;
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um n�mero <br><em>(Valor 0 interrompe)</em></html>"));
			
			total ++;
			soma += numero;
			
			if (numero % 2 == 0) {
				pares++;
			} else {
				impares ++;
			}
			
			if (numero > 100) {
				acima ++;
			}
			
		} while (numero != 0);
		
		media = soma / total;
		
		JOptionPane.showMessageDialog(null, "<html> Resultado final: "
				+ "<br><hr> Total de Valores: " + total
				+ "<br> Total de Pares: " + pares
				+ "<br> Total de �mpares: " + impares
				+ "<br> Acima de 100: " + acima
				+ "<br> Somat�rio Vale: " + soma
				+ "<br> M�dia dos Valores: " + media + "</html>");
	}

}
