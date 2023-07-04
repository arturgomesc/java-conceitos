public class metodos {
    public static void main(String[] args) {
        msg("Oi, eu sou o Artur!", 5);
        System.out.println(soma(10, 40, 30));
        System.out.println(soma2(2.4, 2.7, 8.9));
    }

    public static int soma(int... numeros) { // método para somar quantos valores quiser
        int res = 0;

        for (int n : numeros) {
            res += n;
        }
        return res;
    }

    public static Double soma2(Double... nums) {
        Double res = 0.0;

        for (Double n : nums) {
            res += n;
        }
        return res;
    }

    public static void msg(String m, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(m);
        }
    }
}
