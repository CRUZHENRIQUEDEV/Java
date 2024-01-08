// Classe principal Polimorfismo1 que contém o método main
class Polimorfismo1 {
  public static void main(String[] args) {
    // Criando uma instância da classe Quadrado e chamando o método desenhar
    Quadrado q1 = new Quadrado();
    q1.desenhar();

    // Criando uma instância da classe Circulo e chamando o método desenhar
    Circulo c1 = new Circulo();
    c1.desenhar();
  }
}

// Classe Quadrado, que é uma subclasse de Poligono
class Quadrado extends Poligono {
  // Implementação específica do método desenhar para um quadrado
  @Override
  public void desenhar() {
    System.out.println("Desenhando Quadrado");
  }
}

// Classe Circulo, que é uma subclasse de Poligono
class Circulo extends Poligono {
  // Implementação específica do método desenhar para um círculo
  @Override
  public void desenhar() {
    System.out.println("Desenhando Círculo");
  }
}

// Classe base (Poligono) que pode ter um método desenhar, comum a todas as subclasses
class Poligono {
  // Método desenhar genérico que pode ser sobreescrito por subclasses específicas
  public void desenhar() {
    System.out.println("Desenhando Polígono");
  }
}
