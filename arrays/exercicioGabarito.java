import java.util.Scanner;
public class exercicioGabarito {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        final int tamanho = 5;
        char[] gabarito = {'a', 'b', 'c', 'e', 'a'};
        char[] respostas = new char[tamanho];
        int nota = 0;

        for(int i = 0; i < tamanho; i++) {
            System.out.printf("Informe sua resposta %d: ", i);
            respostas[i] = ler.nextLine().charAt(0);
            }

        for(int i = 0; i < tamanho; i++) {
            if (respostas[i] == gabarito[i]) {
                nota++;
            }
        }

        System.out.printf("%nnota do aluno: %d", nota);
    }
}
