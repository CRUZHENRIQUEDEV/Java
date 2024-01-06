/*
Você é um ávido observador de pássaros
Durante 14 dias você anotou quantos pássaros visitaram o seu jardim
Agora você deseja realizar uma estatística para responder as perguntas a seguir:

A)Número total de pássaros
b) Número total de pássaros na primeira semana
c)Número total de pássaros na segunda semana

Vetor de entrada:
passarosPorDia = [2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1];

 */

 public class VetoresPassaros {

    public static void main(String[] args) {

        // Vetor de entrada representando o número de pássaros por dia durante 14 dias
        int[] passarosPorDia = {2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1};

        // A) Número total de pássaros
        int totalPassaros = calcularTotalPassaros(passarosPorDia);
        System.out.println("A) Número total de pássaros: " + totalPassaros);

        // B) Número total de pássaros na primeira semana (primeiros 7 dias)
        int totalPassarosSemana1 = calcularTotalPassarosSemana(passarosPorDia, 0, 6);
        System.out.println("B) Número total de pássaros na primeira semana: " + totalPassarosSemana1);

        // C) Número total de pássaros na segunda semana (últimos 7 dias)
        int totalPassarosSemana2 = calcularTotalPassarosSemana(passarosPorDia, 7, 13);
        System.out.println("C) Número total de pássaros na segunda semana: " + totalPassarosSemana2);
    }

    // Método para calcular o número total de pássaros
    public static int calcularTotalPassaros(int[] passarosPorDia) {
        int total = 0;
        for (int passaros : passarosPorDia) {
            total += passaros;
        }
        return total;
    }

    // Método para calcular o número total de pássaros em uma semana específica
    public static int calcularTotalPassarosSemana(int[] passarosPorDia, int inicio, int fim) {
        int total = 0;
        for (int i = inicio; i <= fim; i++) {
            total += passarosPorDia[i];
        }
        return total;
    }
}
