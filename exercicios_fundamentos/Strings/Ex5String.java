import java.util.Scanner;

public class Ex5String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira string: ");
        String primeiraString = scanner.nextLine();

        System.out.print("Digite a segunda string: ");
        String segundaString = scanner.nextLine();

        int ocorrencias = contarOcorrencias(primeiraString, segundaString);
        System.out.println("A segunda string ocorre " + ocorrencias + " vezes na primeira string.");
    }

    public static int contarOcorrencias(String primeiraString, String segundaString) {
        int ocorrencias = 0;
        int index = 0;

        while (index != -1) {
            index = primeiraString.indexOf(segundaString, index);
            if (index != -1) {
                ocorrencias++;
                index += segundaString.length();
            }
        }

        return ocorrencias;
    }
}
