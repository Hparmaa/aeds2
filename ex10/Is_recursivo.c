#include <stdio.h>

int Tamanho(char s[]) {
    int cont = 0;

    while (s[cont] != '\0') {
        cont++;
    }

    return (cont);
}

int Vogal(char s[], int i) {

    if (s[i] == '\0') {
        return 1;
    }

    if (s[i] != 'a' &&
        s[i] != 'e' &&
        s[i] != 'i' &&
        s[i] != 'o' &&
        s[i] != 'u' &&
        s[i] != 'A' &&
        s[i] != 'E' &&
        s[i] != 'I' &&
        s[i] != 'O' &&
        s[i] != 'U') {

        return 0;
    }

    return Vogal(s, i + 1);
}

int Consoante(char s[], int i) {

    if (s[i] == '\0') {
        return 1;
    }

    if (!((s[i] >= 'a' && s[i] <= 'z') ||
          (s[i] >= 'A' && s[i] <= 'Z'))) {

        return 0;
    }

    if (s[i] == 'a' ||
        s[i] == 'e' ||
        s[i] == 'i' ||
        s[i] == 'o' ||
        s[i] == 'u' ||
        s[i] == 'A' ||
        s[i] == 'E' ||
        s[i] == 'I' ||
        s[i] == 'O' ||
        s[i] == 'U') {

        return 0;
    }

    return Consoante(s, i + 1);
}

int Inteiro(char s[], int i) {

    if (s[i] == '\0') {
        return 1;
    }

    if (!(s[i] >= '0' && s[i] <= '9')) {
        return 0;
    }

    return Inteiro(s, i + 1);
}

int Real(char s[], int i, int pontos) {

    if (s[i] == '\0') {

        if (pontos <= 1) {
            return 1;
        } else {
            return 0;
        }
    }

    if (!((s[i] >= '0' && s[i] <= '9') ||
          s[i] == '.' ||
          s[i] == ',')) {

        return 0;
    }

    if (s[i] == '.' || s[i] == ',') {
        pontos++;
    }

    if (pontos > 1) {
        return 0;
    }

    return Real(s, i + 1, pontos);
}

void main() {

    char s[1000];

    scanf(" %[^\n]", s);

    while (!(Tamanho(s) == 3 &&
             s[0] == 'F' &&
             s[1] == 'I' &&
             s[2] == 'M')) {

        if (Vogal(s, 0)) {
            printf("SIM ");
        } else {
            printf("NAO ");
        }

        if (Consoante(s, 0)) {
            printf("SIM ");
        } else {
            printf("NAO ");
        }

        if (Inteiro(s, 0)) {
            printf("SIM ");
        } else {
            printf("NAO ");
        }

        if (Real(s, 0, 0)) {
            printf("SIM\n");
        } else {
            printf("NAO\n");
        }

        scanf(" %[^\n]", s);
    }

}
