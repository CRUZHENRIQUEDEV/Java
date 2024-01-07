/*
   Exemplo de classe Gato que estende a classe Animal.

   1. A classe Gato herda os atributos e métodos da classe Animal.
   2. Adicionamos um método 'mostrar' específico para a classe Gato, que imprime uma mensagem.

   Observação: A classe Animal deve existir com seus atributos (como 'nome') para que a herança funcione.

   Resultado: Podemos criar instâncias da classe Gato e acessar seus métodos e os métodos herdados da classe Animal.
*/

public class Gato extends Animal {

    // Método específico da classe Gato
    public void mostrar() {
        System.out.println("Eu sou um gato");
    }
}
