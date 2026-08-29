import java.util.Scanner;

public class Somadigitos {

    public static int somaDigitos(int n) {

        // conserta numero negativo
        if (n < 0) {
            n = -n;
        }

        // base
        if (n == 0) {
            return 0;
        }

        // Pega o último dígito e chama a função
        // novamente com o restante do número
        return (n % 10) + somaDigitos(n / 10);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {

            int n = scan.nextInt();

            int resp = somaDigitos(n);

            System.out.println(resp);
        }

        scan.close();
    }
}
