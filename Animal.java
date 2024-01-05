/*
Explicações:

1. **Classe Animal:**
   - Declaração da classe `Animal`, que encapsula comportamentos e atributos de um animal.

2. **Atributo `nome`:**
   - Declaração da variável de instância `nome` que armazena o nome do animal.

3. **Método `setNome`:**
   - Método público que permite definir o nome do animal.
   - Recebe um parâmetro `n` e atribui esse valor à variável `nome`.

4. **Método `getNome`:**
   - Método público que retorna o nome do animal.
   - Permite acessar o valor da variável `nome` de fora da classe.

5. **Método `Comer`:**
   - Método que imprime uma mensagem indicando que o animal gosta de comer.
   - Não recebe parâmetros e não retorna valores (`void`).

 */
// Definição da classe Animal
class Animal {
  
  // Atributo que armazena o nome do animal
  String nome;

  // Método para definir o nome do animal
  public void setNome(String n) {
    nome = n;
  }

  // Método para obter o nome do animal
  public String getNome() {
    return nome;
  }

  // Método que imprime uma mensagem indicando que o animal gosta de comer
  public void Comer() {
    System.out.println("Eu gosto de comer.");
  }
}
