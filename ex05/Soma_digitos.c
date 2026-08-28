#include <stdio.h> 

int SomaDigitos ( int n ){
	int soma = 0; 
	if (n < 0){ // se o numero for negativo, eu corrijo o erro
		n = -n; 
	}
	while(n > 0){
		soma = soma + (n % 10); // isso pega o ultimo digito e somma
		n = n /10; 
	}
return(soma);
}

void main (){
	int n; 
	int resp;
	while(scanf("%d", &n) != EOF){ // faco isso pq diferente do outro que tem 'FIM' esse nao tem, entao testo para ver ser o scanf consegue ler
		resp = SomaDigitos(n);
		printf("%d\n", resp);
	}
}
