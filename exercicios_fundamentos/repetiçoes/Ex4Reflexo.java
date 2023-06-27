/*
4) Fazer um programa para medir os reflexos do usuário. O programa deve:
• Mostrar a palavra “Agora!” após um tempo aleatório e um número,
também aleatório
• Contar o tempo até que o usuário digite o número pedido e mostrar esse
tempo.
• Dicas: usar o método getTimeInMillis da classe Calendar ou o método
nanoTime da classe System.
 */

import java.util.Random;
import java.util.Scanner;

public class Ex4Reflexo {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1; // Número aleatório de 1 a 10

        System.out.println("Prepare-se...");
        aguardarSegundos(2); // Aguarda 2 segundos

        System.out.println("Agora!");

        long tempoInicio = System.nanoTime();

        Scanner scanner = new Scanner(System.in);
        int numeroDigitado = scanner.nextInt();

        long tempoFim = System.nanoTime();
        long tempoDecorrido = tempoFim - tempoInicio;
        double tempoEmSegundos = tempoDecorrido / 1_000_000_000.0; // Converter para segundos

        if (numeroDigitado == numeroAleatorio) {
            System.out.printf("Você acertou em %.3f segundos! Parabéns!%n", tempoEmSegundos);
        } else {
            System.out.printf("Você errou! O número correto era %d. Tempo: %.3f segundos.%n", numeroAleatorio, tempoEmSegundos);
        }
    }

    private static void aguardarSegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
