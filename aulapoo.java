// Classe principal que contém o método main
public class aulapoo {
    public static void main(String[] args) {
        // Criando uma instância da classe Cao2
        Cao2 cachorro = new Cao2();

        // Definindo a idade do cachorro
        cachorro.setIdade(5);

        // Verificando a idade e exibindo a mensagem correspondente
        if (cachorro.VerificarIdade()) {
            System.out.println("O cachorro é idoso.");
        } else {
            System.out.println("O cachorro é novinho.");
        }
    }
}

// Definição da classe Cao2
class Cao2 {
    // Atributo privado para armazenar a idade
    private int idade;

    // Método para definir a idade do cachorro
    public void setIdade(int novaIdade) {
        // Verificação para garantir que a idade seja um valor positivo
        if (novaIdade >= 0) {
            idade = novaIdade;
        } else {
            System.out.println("Idade inválida. Utilizando valor padrão (zero).");
            idade = 0;
        }
    }

    // Método para verificar se o cachorro é idoso (idade maior ou igual a 5 anos)
    public boolean VerificarIdade() {
        return idade >= 5;
    }
}


