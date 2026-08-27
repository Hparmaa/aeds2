import java.util.Scanner;

public class Is{
	public static void  main( String args []){
		Scanner scan = new Scanner (System.in);
		String s = scan.nextLine();
		boolean resp1 = false; 
		boolean resp2 = false; 
		boolean resp3 = false; 
		boolean resp4 = false; 
		while(!((s.length() == 3 ) && (s.charAt(0) == 'F') && (s.charAt(1) == 'I') && (s.charAt (2) == 'M'))){
			resp1 = Vogal(s);
			resp2 = Consoante(s);
			resp3 = Inteiro(s);
			resp4 = Real(s);
			if ( resp1 == true){
				System.out.print("SIM ");
			}
			else{
				System.out.print("NAO "); 
			}
			if ( resp2 == true){
				System.out.print("SIM ");
			}
			else{
				System.out.print("NAO "); 
			}
			if ( resp3 == true){
				System.out.print("SIM ");
			}
			else{
				System.out.print("NAO "); 
			}
			if ( resp4 == true){
				System.out.print("SIM");
			}
			else{
				System.out.print("NAO" ); 
			}
			System.out.println();
			s = scan.nextLine();
		}
		scan.close();
	}
	public static boolean Vogal (String s ){
		boolean resp = true;
		for ( int i = 0; i < s.length(); i++){
			if ((s.charAt(i) != 'a') &&
			    (s.charAt(i) != 'e') &&
			    (s.charAt(i) != 'i') &&
			    (s.charAt(i) != 'o') &&
			    (s.charAt(i) != 'u') &&
			    (s.charAt(i) != 'A') &&
			    (s.charAt(i) != 'E') &&
			    (s.charAt(i) != 'I') &&
			    (s.charAt(i) != 'O') &&
			    (s.charAt(i) != 'U')) {
				resp = false;
			    }
		}
		return (resp);
	}
	public static boolean Consoante  (String s ){
		boolean resp = true;
		if( s.length() == 0){ resp = false; }
		for ( int i = 0; i < s.length(); i++){
			if (!(( s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ) ||
			    (s.charAt(i) >='A' && s.charAt(i) <='Z'))     ||
			   (s.charAt(i) == 'a' ||
			    s.charAt(i) == 'e' ||
			    s.charAt(i) == 'i' ||
			    s.charAt(i) == 'o' ||
			    s.charAt(i) == 'u' ||
			    s.charAt(i) == 'A' ||
			    s.charAt(i) == 'E' ||
			    s.charAt(i) == 'I' ||
			    s.charAt(i) == 'O' ||
			    s.charAt(i) == 'U')){
				resp = false;
			    }
		}
		return (resp);
	}
	public static boolean Inteiro  (String s ){
		boolean resp = true;
		for ( int i = 0; i < s.length(); i++){
			if (!( s.charAt(i) >= '0' && s.charAt(i) <= '9' )){
				resp = false;
			    }
		}
		return (resp);
	}
	public static boolean Real  (String s ){
		boolean resp = true;
		int cont_erro = 0; 
		for ( int i = 0; i < s.length(); i++){
			if (!( s.charAt(i) >= '0' && s.charAt(i) <= '9' ) && 
			 ((s.charAt(i) != '.') &&( s.charAt(i) != ','  ))){
				resp = false;
			    }
			if (( s.charAt(i) == '.') || (s.charAt(i) == ',')){
				cont_erro++;
			}
		}
		if ( cont_erro > 1){
			resp = false; 
		}
		return (resp);
	}
}

