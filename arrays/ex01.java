public class ex01 {
    public static void main(String[] args) {

        final int tamanho = 5;

        /* int[] num = new int[tamanho];

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;


        for (int i = 0; i < tamanho; i++) {
            System.out.printf("%d%n", num[i]);
        }
        */

        int[] num = {1, 2, 3, 4, 5};

        for (int n:num) {
            System.out.printf("%d%n", n);
        }


        for (int i = tamanho - 1; i >= 0; i--) { //num.length: tamanho do array
            System.out.printf("%d%n", num[i]);
        }


    }
}
