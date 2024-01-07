/*
 * /*
   Exemplo de uma classe 'Poupanca' que estende a classe abstrata 'Conta'.

   1. A classe 'Poupanca' herda os atributos e métodos da classe abstrata 'Conta'.
   2. Implementação do método abstrato 'imprimeExtrato' fornecendo uma implementação específica para a conta poupança.

   Observações:
   - A classe 'Poupanca' é uma classe concreta, ou seja, ela fornece uma implementação concreta para o método abstrato 'imprimeExtrato'.
   - A classe 'Poupanca' herda o atributo 'saldo' e os métodos 'setSaldo', 'getSaldo' da classe abstrata 'Conta'.
*/

public class Poupanca extends Conta {

    // Implementação do método abstrato imprimeExtrato
  public void imprimeExtrato(){
    System.out.println("Saldo: " + this.getSaldo());

  }
}