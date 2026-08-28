#include <stdio.h>

int Tamanho (char * s){
int cont = 0; 
for(int i = 0 ; s[i] != '\0'; i++){
	cont++;
	}
return (cont);
}
void Cesar(char s[], int i ) {
    if (s[i] == '\0') {
        return;
    }

    s[i] = s[i] + 3;

    Cesar(s, i + 1);
}

void  main() {
    char cifra[1000];

    scanf(" %[^\n]", cifra);

    while (!(Tamanho(cifra) == 3 && cifra[0] == 'F' &&
             cifra[1] == 'I' &&
             cifra[2] == 'M'
             )) {
       		 Cesar(cifra, 0);

       		 printf("%s\n", cifra);
    		scanf(" %[^\n]", cifra);
		
        
    }
}
