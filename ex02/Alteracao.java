import java.util.Scanner;
import java.util.Random;
public class Alteracao{
	// pelas minhas pesquisas, ou eu faco isso ou eu passo o random como parametro pra funcao, senao o diff nao bate
	static Random gerador = new Random();

	public static void main (String args[]){
	Scanner scan = new Scanner(System.in);
	gerador.setSeed(4);
	String s = scan.nextLine();
	String trocado = "";
	while(!( (s.length() == 3) && (s.charAt(0) == 'F') && (s.charAt(1) == 'I') && (s.charAt(2) == 'M'))){
		trocado = random(s);
		System.out.println(trocado);	
		s = scan.nextLine();
	}
	scan.close();
}
	public static String random ( String s){
	String resp = "";
	char sera_trocada = (char) ('a' + (Math.abs(gerador.nextInt()) % 26));
	char trocar_por = (char) ('a'+ (Math.abs(gerador.nextInt()) % 26)); 
	for ( int i = 0; i < s.length(); i++){
		if ( s.charAt(i) == sera_trocada)
		{
			resp +=  trocar_por;
		}
		else
		{
			resp += s.charAt(i);
		}
	}
	return (resp);	
	
	}

		
}
