import java.util.Scanner;

public class JogoDama {

public static void main(String[] args) {

for (int linha = 0; linha < 3; linha++) {
for (int coluna = 0; coluna < 8; coluna++) {

    if ((linha + coluna) % 2 == 0) {
tabuleiro[linha][coluna] = new PecaComum(true);
        }
    }
}

for (int linha = 5; linha < 8; linha++) {
for (int coluna = 0; coluna < 8; coluna++) {

    if ((linha + coluna) % 2 == 0) {
tabuleiro[linha][coluna] = new PecaComum(false);

        }
    }
}