/*
   Exemplo de operadores aritméticos em Java.

   1. Declaração e inicialização de variáveis 'numA', 'numB' e 'total'.
   2. Utiliza o operador '+' (adição) para somar 'numA' e 'numB' e imprime o resultado.
   3. Utiliza os operadores '*' (multiplicação), '/' (divisão) e '-' (subtração) para realizar uma expressão
      e imprime o resultado.
   4. Utiliza o operador '%' (resto da divisão) para calcular o resto da divisão de 'numA' por 2 e imprime o resultado.

   Observações:
   - O operador '+' realiza a adição entre operandos.
   - Os operadores '*', '/' e '-' são aplicados conforme a precedência aritmética.
   - O operador '%' retorna o resto da divisão entre dois números.
*/

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        // Declaração e inicialização de variáveis
        double numA = 8;
        double numB = 3;
        double total;

        // Adição de 'numA' e 'numB', e impressão do resultado
        total = numA + numB;
        System.out.println(total);

        // Expressão com múltiplos operadores aritméticos e impressão do resultado
        total = numA * numB + 4 / 6 - numA;
        System.out.println(total);

        // Resto da divisão de 'numA' por 2 e impressão do resultado
        total = numA % 2;
        System.out.println(total);
    }
}
