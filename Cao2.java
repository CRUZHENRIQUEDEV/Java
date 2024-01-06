// Definição da classe Cao2
public class Cao2 {
    // Atributo privado idade
    private int idade;

    // Método para definir a idade
    public void setIdade(int i) {
        idade = i;
    }

    // Método para obter a idade
    public int getIdade() {
        return idade;
    }

    // Método para simular a ação de andar
    public void Andar() {
        System.out.println("Estou andando");
    }

    // Método para verificar se a idade é superior a 10
    public boolean VerificarIdade() {
        // Retorna verdadeiro se a idade for maior que 10, caso contrário, retorna falso
        return idade > 10;
    }
}
