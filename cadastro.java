import java.util.Scanner;

// Classe que implementa um sistema simples de cadastro de alunos e notas
class Cadastro {
    public static void main(String[] args) {
        // Utilizando um bloco try-with-resources para garantir o fechamento automático do Scanner
        try (Scanner entrada = new Scanner(System.in)) {
            // Apresentação das opções disponíveis
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar notas");
            System.out.println("3 - Listar alunos e notas");

            // Leitura da opção escolhida pelo usuário
            int numero = entrada.nextInt();

            // Utilização de um switch para tratar as diferentes opções
            switch (numero) {
                case 1:
                    System.out.println("Vamos cadastrar aluno");
                    // Aqui seria o código para cadastrar um aluno
                    break;
                case 2:
                    System.out.println("Vamos cadastrar nota");
                    // Aqui seria o código para cadastrar notas
                    break;
                case 3:
                    System.out.println("Listar alunos");
                    // Aqui seria o código para listar alunos e notas
                    break;
                default:
                    System.out.println("O número é inválido");
            }
        }
    }
}
