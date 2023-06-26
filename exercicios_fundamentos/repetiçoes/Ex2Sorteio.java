/*
2) Fazer uma classe Ex2Sorteio para:
• Sortear um número de 0 a 1000 (dica: usar Math.random())
• Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
menor do que o número sorteado.
• Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
quantas tentativas ele acertou.
 */
import java.util.Random;
import java.util.Scanner;

public class Ex2Sorteio {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int tentativas = 0, numeroLido;
        boolean acertou = false;
        int numeroAleatorio = random.nextInt(100);

        while (!acertou) {
            System.out.println("Digite um valor aleatório de 1 a 100 até acertar.");
            int numeroSelecionado = entrada.nextInt();
            tentativas ++;

            if (numeroSelecionado == numeroAleatorio) {
                System.out.println("Parabéns, você acertou o número aleatório!");
                break;
            } else if (numeroSelecionado > numeroAleatorio) {
                System.out.println("Tente um número menor.");
            } else System.out.println("Tente um número maior.");
        }
    }
}
