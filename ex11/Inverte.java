
import java.util.Scanner;

public class Inverte {

    public static int Tamanho(String s) {
        return s.length();
    }

    public static void inverte(String s, char[] resp, int i) {
        // retorno
        if (i == s.length()) {
            return;
        }

        //  inverte caracter
        resp[i] = s.charAt(s.length() - 1 - i);

        // recursao
        inverte(s, resp, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        while (!(s.length() == 3 &&
                 s.charAt(0) == 'F' &&
                 s.charAt(1) == 'I' &&
                 s.charAt(2) == 'M')) {

            char[] resp = new char[s.length()]; // cria um vetor de carateres do tamanho da string

            inverte(s, resp, 0);

            System.out.println(new String(resp));// como o outro é um vetor de caracter, aqui eu transformo em String;

            s = scan.nextLine();
        }

        scan.close();
    }
}
