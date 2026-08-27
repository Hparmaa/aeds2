import java.util.Scanner;

public class Cesar {
	public static void main (String args []){
		Scanner scan = new Scanner(System.in);
		String cifra = "";
		cifra = scan.nextLine();
		while (!( (cifra.length() == 3  )&& (cifra.charAt(0) == 'F') && (cifra.charAt(1) == 'I') && (cifra.charAt(2) == 'M') )){

			String resultado = cesar(cifra);
			System.out.println(resultado);
			cifra = scan.nextLine();
		}
		scan.close();
	}

	public static String cesar ( String s ){
		String resp ="";
		for (int i = 0; i < s.length(); i++){
			resp = resp + (char) (s.charAt(i)+3);
		}
	return (resp);
	}
}
