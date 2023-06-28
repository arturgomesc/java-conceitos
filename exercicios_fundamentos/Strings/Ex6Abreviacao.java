/*
Faça um programa que receba um nome completo na forma de uma String e
mostre a abreviatura deste nome. Não se devem abreviar as palavras com 2 ou
menos letras. A abreviatura deve vir separada por pontos. Ex: Paulo Jose de
Almeida Prado. Abreviatura: P. J. de A. P.
 */

import java.util.Scanner;
public class Ex6Abreviacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o seu nome para que possamos fazer a abreviação do mesmo: ");
        String nome = ler.nextLine();

        String nomePedacos[] = nome.split(" ");
        // método .split() : separa String de acordo com um delimitador, no caso, " "

        StringBuilder abreviacao = new StringBuilder();
        //StringBuilder : permite criar e manipular dados de Strings dinamicamente, criando Strings modificáveis

        for(String palavra : nomePedacos) {
            if (palavra.length() > 2) {
                abreviacao.append(Character.toUpperCase(palavra.charAt(0))).append(". ");
            } else {
                abreviacao.append(palavra).append(" ");
            }
        }

        System.out.println("Abreviação: " + abreviacao.toString().trim());

        ler.close();
    }
}
