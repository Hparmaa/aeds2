#include <stdio.h>

char Minusculo (char c){
	if( c >= 'A' && c <= 'Z'){
		c = c + 32; // de acordo com a tabela asci para a conversao de maiuscular para minusculas, peguei no charmap
	}
return ( c );
}


int Tamanho(char s[]){
	int resp = 0;
	for(int i = 0; s[i] != '\0';i++){
		resp++;
	}	
return(resp);
}

int Anagramas(char str1[], char str2[]) {
    int contagem[256] = {0};
    int i;
    int resp;

    // Se os tamanhos forem diferentes, não podem ser anagramas
    if (Tamanho(str1) != Tamanho(str2)) {
        return (0);
    }

    // Conta os caracteres da primeira string
    for (i = 0; str1[i] != '\0'; i++) {
        contagem[Minusculo(str1[i])]++;
    }

    // Subtrai os caracteres da segunda string
    for (i = 0; str2[i] != '\0'; i++) {
        contagem[Minusculo(str2[i])]--;
    }
    resp = 1; 

    // Se algum contador for diferente de zero,
    // as strings não são anagramas
    for (i = 0; i < 256; i++) {
        if (contagem[i] != 0) {
            resp =0;
        }
    }

    return (resp);
}

void  main() {
    char str1[100], str2[100];
    int tamanho;
    scanf("%s", str1);
    tamanho = Tamanho (str1);
    while (!(tamanho == 3 &&  str1[0] == 'F' && str1[1] == 'I' && str1[2] == 'M')) {
   	 scanf("%s", str2);
        if (Anagramas(str1, str2) == 1) {
            printf("SIM\n");
        } else {
            printf("NAO\n");
        }
   	 scanf("%s", str1);
    	tamanho = Tamanho (str1);
    }
}
