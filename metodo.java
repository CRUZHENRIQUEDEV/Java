/* 
    Um método é um bloco de código que realiza uma tarefa específica e é definido dentro de uma classe.
    Um trecho de código que posso seperar do meu codigo principal para executar uma tarefa
    Ele é a unidade fundamental de execução em Java e é utilizado para organizar a lógica do programa.
   Métodos têm um nome, um tipo de retorno (que pode ser void se não retornar nenhum valor) e podem ter parâmetros. 
*/

// A classe é como se fosse um molde, ele serve para dar forma a um objeto, "Uma forma de bolo"
class Metodo {

  public static int somar(int numA, int numB)
  {
      return (numA + numB); 
  } 

  public static void main(String[] args) {
      int total = somar(10, 50);
      System.out.println(total);
  }
}
