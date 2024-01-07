/*
   Exemplo de estrutura de repetição (for) em Java.

   1. Utilizamos a estrutura 'for' para criar um loop que inicia a variável 'cont'
      com o valor 5, e continuará executando enquanto 'cont' for menor ou igual a 20.
   2. A cada iteração do loop, exibimos a mensagem contendo o valor atual da variável 'cont'.
   3. O loop incrementa 'cont' em 1 a cada iteração.

   Resultado: O programa exibirá os números de 5 a 20.
*/

public class EstruturaRepeticaoFor {
    public static void main(String[] args) {
        // Estrutura de repetição (for)
        for (int cont = 5; cont <= 20; cont++) {
            // Exibe os números de 5 a 20
            System.out.println("Número de 5 a 20: " + cont);
        }
    }
}
