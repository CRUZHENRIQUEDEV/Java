/*
 * A herança é um conceito fundamental na programação orientada a objetos (POO) que permite que uma classe, chamada de classe derivada ou subclasse, herde os atributos e métodos de outra classe, chamada de classe base ou superclasse.
 *  A classe derivada pode estender ou modificar o comportamento da classe base, promovendo a reutilização de código e estabelecendo uma relação "é um" entre as duas classes.

Na herança, a classe derivada herda os membros públicos e protegidos da classe base, ganhando acesso aos campos e métodos sem a necessidade de reescrevê-los. 
Isso promove a extensibilidade e manutenção do código. Além disso, a herança permite a criação de hierarquias de classes, organizando conceitos de forma mais abstrata e específica.

Em Java, a herança é implementada usando a palavra-chave `extends`.
 As classes derivadas podem adicionar novos membros, sobrescrever métodos existentes e incluir seus próprios comportamentos específicos, ao mesmo tempo em que herdam as características da classe base.

 */

// Classe principal que demonstra um exemplo de herança em Java
class heranca {
    public static void main(String[] args) {
        // Criando uma instância da classe Pessoa
        Pessoa p = new Pessoa();
        p.nome = "Yan";  // Atribuindo um valor ao atributo 'nome' da classe Pessoa
        //p.comissao = 8.4;  // O atributo 'comissao' não está disponível diretamente na classe Pessoa

        // Criando uma instância da classe Vendedor, que herda de Pessoa
        Vendedor v = new Vendedor();
        v.nome = "Laís";  // Atribuindo um valor ao atributo 'nome' da classe Vendedor
        v.comissao = 8.6;  // Atribuindo um valor ao atributo 'comissao' específico da classe Vendedor
    }
}

// Classe base que representa uma pessoa
class Pessoa {
    String nome;  // Atributo para armazenar o nome da pessoa
}

// Classe derivada de Pessoa que representa um vendedor
class Vendedor extends Pessoa {
    double comissao;  // Atributo adicional específico da classe Vendedor
}
