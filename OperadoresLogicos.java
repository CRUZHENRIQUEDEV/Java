/*
   Exemplo de operadores lógicos em Java.

   1. Declaração e inicialização de variáveis 'a' e 'b'.
   2. Utiliza o operador '>' para verificar se 'a' é maior que 'b' e imprime o resultado.
   3. Utiliza o operador '&&' (AND lógico) para verificar duas condições e imprime o resultado.

   Observações:
   - O operador '>' retorna verdadeiro se 'a' for maior que 'b'.
   - O operador '&&' retorna verdadeiro se ambas as condições forem verdadeiras.
*/

public class OperadoresLogicos {

    public static void main(String[] args) {
        // Declaração e inicialização de variáveis
        int a = 4;
        int b = 8;

        // Verifica se 'a' é maior que 'b' e imprime o resultado
        System.out.println(a > b);

        // Verifica se 'a' é maior que 'b' E 'b' é igual a 8, imprime o resultado
        System.out.println(a > b && b == 8);
    }
}
