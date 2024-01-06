/*
 * Neste código:
 
A interface Conta é definida com três métodos: depositar, sacar, e getSaldo.
Cada método na interface representa uma operação que pode ser realizada em uma conta.
Interfaces em Java são usadas para definir contratos que as classes devem seguir, indicando quais métodos elas devem implementar.
A palavra-chave interface é usada para declarar a interface.
Os métodos na interface não têm implementação; eles apenas definem a assinatura dos métodos que as classes que implementam a interface devem fornecer.
Cada método tem um comentário explicativo indicando sua finalidade.

 */

// Definição de uma interface chamada Conta
interface Conta {
    // Método para depositar um valor na conta
    void depositar(double valor);

    // Método para sacar um valor da conta
    void sacar(double valor);

    // Método para obter o saldo atual da conta
    double getSaldo();
}

