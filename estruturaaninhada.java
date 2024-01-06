/*
   Exemplo de uso de estrutura de repetição aninhada (for aninhado) em Java.

   1. Utilizamos dois loops for para criar uma tabela de multiplicação.
   2. O primeiro loop (i) varia de 0 a 10.
   3. O segundo loop (j) varia de 0 a 10 para cada valor de i.
   4. Imprimimos a multiplicação de i por j para formar a tabela.
*/

public class EstruturaAninhada {
    public static void main(String[] args) {
        // Loop externo para i
        for (int i = 0; i <= 10; i++) {
            // Loop interno para j
            for (int j = 0; j <= 10; j++) {
                // Imprime a multiplicação de i por j
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
