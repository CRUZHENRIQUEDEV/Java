/*
   Exemplo de uso da estrutura condicional simples (if) em Java.

   1. Criamos uma variável inteira chamada nota e atribuímos o valor 2.
   2. Utilizamos a estrutura condicional if para verificar se a nota é maior ou igual a 5.
   3. Se a condição for verdadeira, imprime "Aprovado" e "Parabéns".
*/

public class CondicionalSimples {
    public static void main(String[] args) {
        // Definindo a nota
        int nota = 2;

        // Verificando se a nota é maior ou igual a 5
        if (nota >= 5) {
            // Se verdadeiro, imprime "Aprovado" e "Parabéns"
            System.out.println("Aprovado");
            System.out.println("Parabéns");
        }
    }
}
