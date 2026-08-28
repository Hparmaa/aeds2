#include <stdio.h> 

int Tamanho ( char * s){
int cont = 0;
for(int i = 0;s[i] != '\0'; i++){
	cont++;
	}
return(cont);
}

void inverte(char s[], char resp[]){
	int tamanho = 0;
	 tamanho = Tamanho(s);
	for ( int i = 0; i < tamanho; i++){
		resp [i] = s[tamanho - 1 -i];//talvez seja tamanho -1
	}
	resp[tamanho] = '\0';
}

void print_string (char resp[]){
	int tamanho = 0; 
	tamanho = Tamanho(resp);
	for (int i = 0; i < tamanho; i++){
		printf("%c", resp[i]);
	}
	printf("\n");
}
void main (){
char s [101] = "";
char resp [101]= "";
int tamanho = 0;
scanf("%[^\n]", s);
getchar();
tamanho = Tamanho(s);
while(!(tamanho == 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M')){
	inverte(s, resp);
	print_string(resp);
	scanf("%[^\n]", s);
	getchar();
	tamanho = Tamanho(s);
	}
}
