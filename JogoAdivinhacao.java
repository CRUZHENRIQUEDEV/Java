/*
   Exemplo de jogo de adivinhação.

   1. Utiliza a classe Random para gerar um número aleatório de 0 a 99.
   2. Solicita ao usuário que adivinhe o número.
   3. Compara a entrada do usuário com o número gerado aleatoriamente.
   4. Imprime mensagens indicando se o usuário acertou ou errou.

   Observações:
   - O código usa try-with-resources para garantir que o Scanner seja fechado após o uso.
   - O número aleatório é gerado com nextInt(100), o que resulta em números de 0 a 99.
*/

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        // Gerador de números aleatórios
        Random gerador = new Random();
        
        // Gera um número aleatório de 0 a 99
        int numeroAleatorio = gerador.nextInt(100);

        // Utiliza try-with-resources para garantir o fechamento do Scanner
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Adivinhe o número que estou pensando (de 0 a 99): ");
            
            // Lê a entrada do usuário
            int numeroUsuario = entrada.nextInt();

            // Compara o número do usuário com o número gerado aleatoriamente
            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Parabéns, você acertou! Eu estava pensando no número " + numeroAleatorio);
            } else {
                System.out.println("Você errou! Eu estava pensando no número " + numeroAleatorio);
            }
        }
    }
}
