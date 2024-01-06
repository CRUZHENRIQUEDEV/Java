// Definição da classe Cao
public class Cao {
    // Atributos da classe Cao
    String nome;
    String cor;
    int idade;
    double peso;

    // Construtor padrão
    public Cao() {
        cor = "Caramelo";
    }

    // Construtor personalizado com parâmetros
    public Cao(String nome, int idade) {
        // Utilizando a palavra-chave "this" para referenciar os atributos da classe
        this.nome = nome;
        this.idade = idade;
    }

    // Método para simular a ação de andar
    public void Anda() {
        System.out.println("Estou andando..." + cor);
    }

    // Método para exibir dados do cachorro
    public void DadosCao() {
        System.out.println(nome + " " + idade);
    }
}
