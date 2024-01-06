/*
   Exemplo de estrutura condicional composta em Java.

   1. Declaramos uma variável 'nota' e atribuímos o valor 2.
   2. Utilizamos a estrutura 'if' para verificar se a nota é maior ou igual a 5.
   3. Se a condição for verdadeira, imprime "Aprovado".
   4. Caso contrário, imprime "Reprovado".
*/

public class CondicionalComposta {
    public static void main(String[] args) {
        // Declaração e atribuição da variável nota
        int nota = 2;

        // Estrutura condicional composta
        if (nota >= 5) {
            // Se a condição for verdadeira, imprime "Aprovado"
            System.out.println("Aprovado");
        } else {
            // Caso contrário, imprime "Reprovado"
            System.out.println("Reprovado");
        }
    }
}
