import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try (Scanner entrada = new Scanner(System.in)) {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Cadastrar aluno: ");
        System.out.println("2 - Cadastrar notas: ");
        System.out.println("3 - Listar alunos e nota ");

        int numero =entrada.nextInt();

        switch (numero){
          case 1:
            System.out.println("Vamos cadastrar aluno");
          break;
          case 2:
            System.out.println("Vamos cadastrar nota");
          break;
          case 3:
            System.out.println("Listar alunos");
          break;
          default:
            System.out.println("O número é inválido");
        }
    }
  }
}