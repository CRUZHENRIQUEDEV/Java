/*
   Exemplo de utilização de ArrayList e Iterator em Java.

   1. Criamos um ArrayList chamado numeros para armazenar elementos do tipo Integer.
   2. Adicionamos alguns elementos ao ArrayList.
   3. Imprimimos o ArrayList para visualização.
   4. Criamos uma instância de Iterator para percorrer a lista.
   5. Utilizamos o método next() do Iterator para obter e imprimir o primeiro elemento.
   6. Utilizamos o loop while, hasNext() e forEachRemaining() para percorrer e imprimir os elementos restantes da lista.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
    public static void main(String[] args) {
        // Criando um ArrayList de Integers
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        numeros.add(1);
        numeros.add(3);
        numeros.add(2);

        // Imprimindo o ArrayList
        System.out.println("ArrayList: " + numeros);

        // Criando uma instância de Iterator para percorrer a lista
        Iterator<Integer> it = numeros.iterator();

        // Obtendo e imprimindo o primeiro elemento usando o método next()
        int numero = it.next();
        System.out.println("Elemento: " + numero);

        // Usando o método hasNext() e forEachRemaining() para percorrer os elementos restantes
        while (it.hasNext()) {
            it.forEachRemaining((value) -> System.out.print(value + ", "));
        }
    }
}

