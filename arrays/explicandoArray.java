/*
Um array é uma estrutura de dados usada para armazenar dados do mesmo tipo. Os arrays armazenam
 seus elementos em localizações sequenciais contínuas da memória.

Em Java, arrays são objetos. Todos os métodos da classe Object podem ser invocados em um array.
 Podemos armazenar um número fixo de elementos em um array.
 */

public class explicandoArray {
    public static void main(String[] args) {
        final int tamanho = 5;

        int[] num = new int[tamanho];
        int[] numeros = {10, 20, 30, 40, 50};

        num[0] = 1;
        num[1] = 7;
        num[2] = 189;
        num[3] = 15;
        num[4] = 12;

        System.out.printf("%d", num[3]);
        System.out.printf("%d", numeros[1]);

        for (int i = 0; i < num.length; i++) {
            System.out.printf(" %d - ", num[i]);
        }
    }
}
