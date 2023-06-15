import java.util.Scanner;
public class desafioProva {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        final int numPerguntas = 5;
        int pontoQuestao = 2;
        char[] gabarito = {'c', 'c', 'a', 'c', 'c'};

        String[] perguntas = {
                "Qual o menor estado do Brasil? ",
                "Qual a capital do Rio Grande do Sul?",
                "Qual o valor de X para 5! = x ?",
                "Minecraft foi feito em qual linguagem de programação?",
                "Qual a última letra do nosso alfabeto?"
        };

        String[] alternativas = {
                "a) Pará  |  b) Rio Grande do Norte  |  c) Sergipe   ",
                "a) Porto Velho  | b) Belo Horizonte  |  c) Porto Alegre   ",
                "a) 120  |  b) 60  | c) 220",
                "a) Cobol  |  b) Python  |  c) Java  ",
                "a) A  |  b) B  |c) Z  ",
        };

        char[] respostas = new char[numPerguntas];
        char resp;
        int nota = 0;
        String aluno;

        System.out.println("Digite o seu nome: ");
        aluno = ler.nextLine();

        for(int i = 0;i < numPerguntas; i++) {
            System.out.println("//////////////////////////////");
            System.out.printf("Pergunta %d%n", i + 1);
            System.out.printf("%s%n", perguntas[i]);
            System.out.printf("%s%n", alternativas[i]);
            resp = ler.nextLine().charAt(0);
            respostas[i] = resp;
        }
        System.out.printf("%s%n","Fim da prova, confira o resultado: ");
        for (int i = 0; i < numPerguntas; i++){
            if (gabarito[i] == respostas[i]) {
                nota += pontoQuestao;
            }
        }

        System.out.printf("%s, sua nota foi %d. Você foi %s", aluno, nota, nota >= 6 ? "aprovado!" : "reprovado.");
    }
}
