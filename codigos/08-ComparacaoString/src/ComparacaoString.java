
public class ComparacaoString {

	public static void main(String[] args) {
		
		String nome1 = "Bruno";
		String nome2 = "Bruno";
		String nome3 = new String("Bruno");
		String res;
		res = (nome1.equals(nome3)) ? "igual" : "diferente";
		System.out.println(res);

	}

}
