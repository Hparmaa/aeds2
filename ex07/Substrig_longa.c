#include <stdio.h>

int Tamanho(char s[]) {
    int resp = 0;

    for (int i = 0; s[i] != '\0'; i++) {
        resp++;
    }

    return resp;
}

int MaiorSubstring(char s[]) {
    int maior = 0;
    int i;
    int j;
    int contagem[256];

    for (i = 0; s[i] != '\0'; i++) { // esse for vai tentar comecar uma subtring em cada posicao

        // zera contagem
        for (j = 0; j < 256; j++) {
            contagem[j] = 0;
        }

        // esse for adiciona os carac enquanto eles nao se repetirem, por isso o if, pois se tiverem 2 caracteres iguais nao vale
        for (j = i; s[j] != '\0'; j++) {

            if (contagem[s[j]] == 1) {
                break;
            }

            contagem[s[j]] = 1;
        }

        // j - i é o tamanho da substring
        if (j - i > maior) {
            maior = j - i;
        }
    }

    return maior;
}

void  main() {
    char str[100];

    scanf("%s", str);

    while (!(Tamanho(str) == 3 &&
             str[0] == 'F' &&
             str[1] == 'I' &&
             str[2] == 'M')) {

        printf("%d\n", MaiorSubstring(str));

        scanf("%s", str);
    }
}
