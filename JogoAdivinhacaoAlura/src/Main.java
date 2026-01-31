import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        boolean acertou = false;
        int tentativas = 0; // DECLAREI ANTES DO FOR

        System.out.println("Bem vindo (a) ao jogo de adivinhação");
        System.out.println("Tente adivinhar um numero de 0 a 100. Você tem 5 chances");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Tentativa " + i + ": Digite seu chute: ");
            int chute = leitor.nextInt();
            tentativas++; //  INCREMENTA AQUI

            if (chute == numeroGerado) {
                System.out.println("Você acertoooouuu :D em " + tentativas + " tentativas! ");
                acertou = true;
                break; // PARA O LOOP PARAR
            } else if (chute < numeroGerado) {
                System.out.println("O numero secreto é MAIOR que " + chute + ".");
            } else {

                System.out.println("O numero secreto é MENOR que " + chute + ".");
            }
        }


        if (!acertou) {
            System.out.println("\nQue pena! Suas 5 tentativas acabaram.");
            System.out.println("O número secreto era: " + numeroGerado);
        }

        leitor.close();
    }
}

