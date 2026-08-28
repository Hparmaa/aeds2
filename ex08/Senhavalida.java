import java.util.Scanner;

public class Senhavalida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        while (!( s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M')) {

            if (SenhaValida(s)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }

            s = scanner.nextLine();
        }

        scanner.close();
    }
    public static boolean SenhaValida(String senha) {
        boolean maiuscula = false;
        boolean minuscula = false;
        boolean numero = false;
        boolean especial = false;

        if (senha.length() < 8) {
            return false;
        }

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                maiuscula = true;
            } else
		    if (c >= 'a' && c <= 'z') {
                minuscula = true;
          	 }
		 else
			 if (c >= '0' && c <= '9') {
                numero = true;
           		 }
		 else {
                especial = true;
           	 }
        }

        return( maiuscula && minuscula && numero && especial);
    }
}

