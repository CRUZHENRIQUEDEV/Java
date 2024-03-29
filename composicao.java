/*
   Exemplo de uma classe 'Composicao' que cria uma instância da classe 'Pedido' usando composição.
*/

// Classe principal que contém o método main
class Composicao {
  public static void main(String[] args) {
    // Criando uma instância da classe Pedido usando composição
    new Pedido();
  }
}

// Classe Pedido, que representa um pedido
class Pedido {
  // A classe Pedido pode ter outras classes como parte de sua composição
  // (exemplo: Itens, Cliente, etc.), mas aqui temos um exemplo simples.
  // Ao criar um Pedido, estamos utilizando o conceito de composição.
}
