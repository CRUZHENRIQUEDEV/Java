import java.util.LinkedList;  // Importando a classe LinkedList do pacote java.util

public class MinhaLinkedList {  // Renomeando a classe para evitar conflito com o nome da classe importada

    public static void main(String[] args) {
        // Criando uma instância da classe LinkedList para armazenar strings
        LinkedList<String> animais = new LinkedList<>();

        // Adicionando alguns animais à LinkedList
        animais.add("Cachorro");
        animais.add("Cavalo");
        animais.add("Vaca");
        System.out.println("Linkedlist: " + animais);

        // Adicionando "Gato" na posição 1 da LinkedList
        animais.add(1, "Gato");
        System.out.println("Linkedlist após adicionar 'Gato' na posição 1: " + animais);
    }
}
