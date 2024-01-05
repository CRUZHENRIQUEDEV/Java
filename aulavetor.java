/* 
Em Java, o termo "vetor" é frequentemente utilizado para se referir a arrays unidimensionais. 
Um vetor é uma estrutura de dados que armazena elementos do mesmo tipo em uma sequência contígua de memória.
 Os elementos em um vetor são acessados através de índices.

Definição

**Vetor (Array) em Java:**
- Um vetor é uma estrutura de dados que armazena uma coleção de elementos do mesmo tipo.
- Os elementos em um vetor são acessados através de índices inteiros não negativos.
- Os índices em um vetor começam em 0 e vão até (tamanho do vetor - 1).
- Em Java, a sintaxe para declarar um vetor é especificar o tipo dos elementos seguido por colchetes `[]`.
- O tamanho de um vetor é fixo após a sua criação e não pode ser alterado dinamicamente.
- Para criar um vetor em Java, você pode usar a palavra-chave `new` seguida pelo tipo do vetor e o tamanho do vetor.

Aqui está um exemplo simples de declaração e inicialização de um vetor em Java:
*/
import java.util.ArrayList;

class aulavetor {
    public static void main(String[] args) {

        // Criando um ArrayList chamado "bandas" que armazenará Strings
        ArrayList<String> bandas = new ArrayList<String>();

        // Adicionando algumas bandas ao ArrayList
        bandas.add("Kiss");
        bandas.add("Beatles");
        bandas.add("Iron Maiden");

        // Exibindo as bandas presentes no ArrayList
        System.out.println("Lista de bandas inicial: " + bandas);

        // Adicionando "Capital Inicial" no índice onde está "Kiss"
        bandas.add(bandas.indexOf("Kiss"), "Capital Inicial");

        // Exibindo o ArrayList após a adição de "Capital Inicial"
        System.out.println("Lista de bandas após adicionar 'Capital Inicial': " + bandas);

        // Removendo a banda "Kiss" do ArrayList
        bandas.remove("Kiss");
        System.out.println("Lista de bandas após remover 'Kiss': " + bandas);

        // Limpando o ArrayList (removendo todos os elementos)
        bandas.clear();
        System.out.println("Lista de bandas após limpar o ArrayList: " + bandas);
    }
}
