import java.util.Locale;

public class IdiomaSistema {

	public static void main(String[] args) {
		
		Locale loc = Locale.getDefault();
		
		System.out.print("O idioma do sistema est� em ");
		System.out.println(loc.getDisplayLanguage());

	}

}
