/*
1) Fazer uma classe Ex1Primos para:
    • Receber um inteiro N do usuário
    • Testar se este inteiro é primo ou não e informar
 */
import java.util.Scanner;
public class Ex1Primos {
    public static void main(String[] args) {
        Scanner receber = new Scanner(System.in);

        System.out.println("Olá! Digite um número para saber se ele é primo ou não: ");
        int num = receber.nextInt();

        if (num == 2 || num == 3) {
            System.out.println("É um número primo!");
        } else if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("Não é um número primo.");
        } else {
            System.out.println("É um número primo!");
        }
    }
}
