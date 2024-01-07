/*
   Exemplo de uma classe 'Pedido' que utiliza composição com a classe 'Itens'.

   1. A classe 'Pedido' possui um atributo privado 'i' do tipo 'Itens', representando a relação de composição.
   2. No construtor padrão da classe 'Pedido', uma nova instância da classe 'Itens' é criada, mas o campo 'i' não é utilizado diretamente.
   3. A composição é um relacionamento onde um objeto é parte de outro objeto, e a vida útil do objeto contido (Itens) é controlada pelo objeto contenedor (Pedido).

   Observações:
   - A classe 'Itens' não foi fornecida no contexto deste código, mas é assumido que ela é uma classe existente e faz parte da composição com 'Pedido'.
*/

public class Pedido {
    // Construtor padrão da classe Pedido
    public Pedido() {
        // Inicialização do atributo i, criando uma nova instância da classe Itens
        Itens i = new Itens();
    }
}
