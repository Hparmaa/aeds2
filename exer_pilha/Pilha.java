import java.util.Scanner;
public class Pilha {
	private int []array;
	private int n;


public Pilha(int tamanho){//constroi a pilha com capacidade máxima igual a tamanho
	array = new int[tamanho];
	int n = 0; 
}

public void empilhar(int x) { //empilha x à plha
		array[n++] = x;
}

public int desempilhar() {  //desempilha da pilha e retorna o elemento desempilhado
	int resp = 0; 
	resp = array[--n];
	return (resp); 
}

public void mostrar() {  //imprime os elementos da pilha partindo do topo
	for(int i = n -1; i >= 0; i--){
		System.out.print(array[i] + " ");
	}	
}

public boolean pesquisar(int x) {  //retorna true caso o elemento x esteja na pilha e false caso contrário
	boolean resp = false;
	for ( int i = n - 1 ; i > 0 ; i--){
		if (array[i] == x){
			resp = true;
			i = 0; 
		}
	}
return (resp);
}
	public static void  main ( String args[]){
		Scanner scan = new Scanner(System.in);
		char letra;
		int valor = 0;
		int result;
		boolean pesquisa;
		Pilha pilha = null ;
		while (scan.hasNext()){
			letra = scan.next().charAt(0);
			if ( letra == 'C'){
				valor = scan.nextInt();
				pilha = new Pilha(valor);
			}
			else
				if( letra == 'E'){ 
					valor = scan.nextInt();
					pilha.empilhar(valor);
				}
			else
				if( letra == 'D'){ 
					result = pilha.desempilhar();
				}
			else
				if( letra == 'M'){ 
					pilha.mostrar();
				}
			else
				if( letra == 'Y'){ 
					valor = scan.nextInt();
					pesquisa = pilha.pesquisar(valor);
					if (pesquisa )
					{ System.out.println("S");}
					else { System.out.println("N");
						}
						
			}
		}
	}
}
