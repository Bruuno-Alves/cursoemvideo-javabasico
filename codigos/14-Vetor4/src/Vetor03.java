import java.util.Arrays;

public class Vetor03 {

	public static void main(String[] args) {
		
		double num[] = {3.75, 2.75, 9, -4.5};
		Arrays.sort(num);
		for (double valor: num) {
			System.out.println(valor);
		}

	}

}
