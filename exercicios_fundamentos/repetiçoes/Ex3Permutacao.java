/*
3) Fazer um programa para receber dois números do tipo int do usuário e
determinar se um número é permutação do outro ou não. Ex: 431 é permutação
de 143, 42 é permutação de 204, 1211 é permutação de 1112, etc. O programa
só deve aceitar números positivos.
 */

import java.util.Scanner;
import java.util.Arrays;
public class Ex3Permutacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = ler.nextInt();

        System.out.println("Digite o segundo número (verificação de permutação): ");
        int num2 = ler.nextInt();

        if (isPermutation(num1, num2)) {
            System.out.println("Sim, os números são permutações um do outro!");
        } else System.out.println("Os valores não são permutações um do outro.");
    }

    public static boolean isPermutation(int num1, int num2) {
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Os números devem ser inteiros e positivos.");
            System.exit(0);
        }

        String strNum1 = String.valueOf(num1);
        String strNum2 = String.valueOf(num2);

        if (strNum1.length() != strNum2.length()) {
            System.out.println("Os valores não são permutações.");
        }

        char[] charArray1 = strNum1.toCharArray();
        char[] charArray2 = strNum2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}


