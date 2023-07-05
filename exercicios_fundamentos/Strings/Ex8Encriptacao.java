import java.util.Scanner;
import java.util.ArrayList;
public class Ex8Encriptacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua mensagem a ser criptografada: ");
        String msg = ler.nextLine();

        System.out.println("Digite o valor de J(chave da criptografia): ");
        int chave = ler.nextInt();

        String msgCriptografada = criptografarCesar(msg, chave);

        System.out.println("Mensagem criptografada: " + msgCriptografada);

    }

    public static String criptografarCesar(String msg, int chave) {
        StringBuilder msgCriptografada = new StringBuilder();

        for (int i = 0; i < msg.length(); i++) {
            char caractere = msg.charAt(i);

            if (Character.isLetter(caractere)) {

                caractere = Character.toUpperCase(caractere);

                int valorAscii = ((int) caractere - (int) 'A' + chave) % 26;
                char caractereCriptografado = (char) (valorAscii + (int) 'A');

                msgCriptografada.append(caractereCriptografado);
            } else msgCriptografada.append(caractere);
        }

        return msgCriptografada.toString();
    }
}
