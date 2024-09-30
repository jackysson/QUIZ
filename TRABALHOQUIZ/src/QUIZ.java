import java.util.Scanner;

class Quiz {

    public static void cabecalho() {

         System.out.println("Faculdade: Unifan.");
        System.out.println("Aluno: Jackysson willyan Rios Mota.");
        System.out.println("Professor: Brenno.");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("Bem vindo ao QUIZ." +
                "você irá ser testado sobre seus conhecimetos em redes de internet" +
                "boa sorte");
        System.out.println("-------//-------//-------//-------//-------");
    }
    //NOME E CONTADOR
    public static void main(String[] args) {
        int contador = 0;
        cabecalho();
        Scanner n = new Scanner(System.in);
        System.out.println("");
        System.out.println("-------//-------//-------//-------//-------");

       //QUESTÕES 1-15
        //PERGUNTA 01

        String questao = "QUESTÃO 01: Qual dos protocolos abaixo" +
                " é responsável por controlar o fluxo de dados na Internet," +
                " dividindo grandes pacotes de dados em pacotes menores e garantindo" +
                " a entrega ordenada desses pacotes ao destino??";

        System.out.println(questao);

        System.out.println("Alternativas");

        System.out.println("[A]  HTTP");
        System.out.println("[B]  FTP");
        System.out.println("[C]  TCP");
        System.out.println("[D]  UDP");
        System.out.println("[E]  SMTP");

        System.out.println("Digite sua resposta:");
        String resposta = scanner.nextLine();

        if(resposta.equals("c")){
            System.out.println("Resposta correta!");
        } else{
            System.out.println("Resposta errada!");
        }



    }
}
