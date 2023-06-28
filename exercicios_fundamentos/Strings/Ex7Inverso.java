/*
7) Fazer um programa que receba uma string do usuário e mostre o conteúdo desta
string de forma invertida.
 */

import java.util.Scanner;
public class Ex7Inverso {
    public static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma String: ");
        String string = ler.nextLine();

        string = reverse(string);

        System.out.println("O reverso da String digitada: " + string);
    }
}

// MANEIRA ALTERNATIVA: USANDO STACK
/*
import java.util.Stack;

class Main
{
    // Método para reverter uma string em Java usando uma Stack e array de caracteres
    public static String reverse(String str)
    {
        // caso base: se a string for nula ou vazia
        if (str == null || str.equals("")) {
            return str;
        }

        // cria uma Stack vazia de caracteres
        Stack<Character> stack = new Stack<Character>();

        // empurra cada caractere da string dada para a Stack
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            stack.push(ch[i]);
        }

        //começa do índice 0
        int k = 0;

        // retira os caracteres da Stack até esvaziar
        while (!stack.isEmpty())
        {
            // atribui cada caractere exibido de volta ao array de caracteres
            ch[k++] = stack.pop();
        }

        // converte a array de caracteres em uma string e a retorna
        return String.copyValueOf(ch);
    }

    public static void main(String[] args)
    {
        String str = "Techie Delight";

        str = reverse(str);        // string é imutável

        System.out.println("The reverse of the given string is: " + str);
    }
}
 */


