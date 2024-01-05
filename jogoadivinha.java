import java.util.Scanner;
import java.util.Random;

class jogoadivinha {
  public static void main(String[] args) {
    Random gerador = new Random();
    int x = gerador.nextInt(100);

    try (Scanner entrada = new Scanner(System.in)) {
        System.out.println("Adivinhe o número que estou pensando ");
        int numero = entrada.nextInt();

        if(numero == x){
          System.out.println("Parabéns, vc acertou, eu pensei no " + x);
        }
        else{
          System.out.println("Você erooooouuu, eu pensei no " + x);
        }
    }
    
  }
}