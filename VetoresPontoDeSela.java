/*
 
 */
public class VetoresPontoDeSela {

    public static void main(String[] args) {

        // Matriz fornecida
        int[][] matriz = {
                {9, 8, 7},
                {5, 3, 2},
                {6, 6, 7},
        };

        // Encontrar o maior elemento em cada linha
        int[] maiorLinha = new int[3];
        int[] menorColuna = new int[3];

        // Inicializar os arrays com valores adequados
        for (int i = 0; i < 3; i++)
            maiorLinha[i] = 0;

        for (int i = 0; i < 3; i++)
            menorColuna[i] = 10;

        // Encontrar o maior elemento em cada linha
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maiorLinha[i]) {
                    maiorLinha[i] = matriz[i][j];
                }
            }
        }

        // Encontrar o menor elemento em cada coluna
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] < menorColuna[j]) {
                    menorColuna[j] = matriz[i][j];
                }
            }
        }

        // Encontrar o ponto de sela
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (maiorLinha[i] == menorColuna[j]) {
                    System.out.println("Ponto de sela: " + maiorLinha[i]);
                }
            }
        }
    }
}
