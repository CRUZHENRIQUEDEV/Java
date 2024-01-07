/*
   Exemplo de estrutura de repetição (while) em Java.

   1. Utilizamos a estrutura 'while' para criar um loop que continuará
      executando enquanto a variável 'opcao' for diferente de 99.
   2. Dentro do loop, solicitamos que o usuário digite um valor.
   3. Se o valor digitado for 99, o loop será encerrado.
*/

import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        // Declaração da variável opcao
        int opcao = 0;

        // Estrutura de repetição (while)
        while (opcao != 99) {
            // Solicita ao usuário que digite um valor
            System.out.println("Digite um valor qualquer ou 99 para sair:");

            // Utiliza try-with-resources para fechar automaticamente o Scanner
            try (Scanner entrada = new Scanner(System.in)) {
                // Lê o valor digitado pelo usuário
                opcao = entrada.nextInt();
            }
        }
    }
}
