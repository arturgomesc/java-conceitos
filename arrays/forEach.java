import java.util.Arrays;

public class forEach {
    public static void main(String[] args) {
        int[] num = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};

        int[] num2 = {7, 0, 9, 2, 5, 8, 1, 3, 4, 6};
        Arrays.sort(num2); //ordena or valores de um array do maior para o menor.

        final int tamanho = 10;
        int[] numeros = new int[tamanho];
        Arrays.fill(numeros, 10); // atribui um dado a uma quantidade de vezes dentro de uma matriz especificada.

        System.arraycopy(num, 0, num2, 0, 10); // transfere os valores de um array para outro array.

        Arrays.equals(num, num2); // é um boolean: compara dois arrays e retorna true caso sejam iguais.

        int pesquisa = 10;
        int pos = 0;
        Arrays.binarySearch(num, pesquisa); //encontra um valor dentro de uma array. É necessário que o array esteja ordenado para funcionar.



        /* antes:
        for(int i = 0; i < num.length; i++) {
            System.out.printf("%d - ", num[i]);
        }
        */

        // depois:

        for(int n : num) {
            System.out.printf("%d - ", n);
        }

        System.out.printf("%n");

        for(int n: num2) {
            System.out.printf("%d | ", n);
        }

        System.out.printf("%n");

        for(int n : numeros) {
            System.out.printf("%d ", n);
        }

        System.out.printf("%n");

        System.out.printf("Arrays são iguais:%s",Arrays.equals(num, num2) ? "Sim" : "Não");

        System.out.printf("%n");

        pos = Arrays.binarySearch(num, pesquisa);
        System.out.printf("O elemento %d está no array? %s", pesquisa, pos > 0 ? "Sim" : "Não");
    }
}
