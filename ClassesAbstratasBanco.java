/*
 * Uma classe abstrata em Java é uma classe que não pode ser instanciada diretamente, mas pode ser usada como uma classe base para outras classes.
 *  É uma forma de modelar conceitos gerais e compartilhar comportamentos entre várias classes relacionadas. Aqui estão alguns pontos-chave sobre classes abstratas em Java:

1. **Não Pode Ser Instanciada Diretamente:**
   - Uma classe abstrata não pode ser usada para criar objetos diretamente. Ela existe principalmente para ser estendida por outras classes.

2. **Pode Conter Métodos Abstratos:**
   - Uma classe abstrata pode conter métodos abstratos, que são métodos sem implementação. Esses métodos devem ser implementados pelas classes derivadas.

3. **Pode Conter Métodos Concretos:**
   - Além de métodos abstratos, uma classe abstrata pode conter métodos concretos (com implementação) que podem ser herdados pelas classes filhas.

4. **Pode Ter Construtores:**
   - Uma classe abstrata pode ter construtores. Esses construtores podem ser chamados pelos construtores das classes derivadas.

5. **Deve Ser Estendida:**
   - Para utilizar uma classe abstrata, você deve criar uma classe filha (subclasse) que estenda a classe abstrata. A subclasse deve fornecer implementações para todos os métodos abstratos definidos na classe abstrata.

6. **Pode Conter Atributos:**
   - Pode ter atributos e campos, assim como uma classe regular.

7. **Utilidade na Modelagem de Hierarquias:**
   - Classes abstratas são frequentemente usadas na modelagem de hierarquias de classes, onde várias classes compartilham um conjunto comum de características, mas cada uma pode ter implementações específicas.

 */

// Definição da classe principal ClassesAbstratas
public class ClassesAbstratasBanco {
    public static void main(String[] args) {
        // Criando uma instância de Poupanca e referenciando através da classe Conta (polimorfismo)
        Conta cp = new Poupanca();
        
        // Chamando métodos da classe Conta
        cp.setSaldo(732);
        cp.imprimeExtrato();
        cp.getSaldo();
    }
}
