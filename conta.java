/*
   Exemplo de classe abstrata em Java representando uma conta.

   1. Declaração da classe abstrata 'Conta'.
   2. Atributo privado 'saldo' para armazenar o saldo da conta.
   3. Métodos 'setSaldo' e 'getSaldo' para configurar e obter o saldo da conta, respectivamente.
   4. Método abstrato 'imprimeExtrato' que representa a ação de imprimir o extrato da conta.

   Observações:
   - A classe é marcada como abstrata usando a palavra-chave 'abstract'.
   - Métodos abstratos são declarados sem implementação e devem ser implementados nas subclasses concretas.
   - A classe abstrata pode conter métodos concretos (com implementação) e/ou métodos abstratos.
*/

public abstract class Conta {

    // Atributo privado para armazenar o saldo da conta
    private double saldo;

    // Método para configurar o saldo da conta
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para obter o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // Método abstrato para imprimir o extrato da conta (deve ser implementado nas subclasses)
    public abstract void imprimeExtrato();
}
