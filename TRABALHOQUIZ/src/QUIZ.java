import java.util.Scanner;

class Quiz {

    private static System String;

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
    //INICIALIZAÇÃO DO PROJETO

    public static void main(String[] args) {

        //BASE DO QUIZ

        class item {

            //PERGUNTAS
            String questions = "";
            String A = "";
            String B = "";
            String C = "";
            String D = "";
            String E = "";
            String correta = "";

            public void escrevaresposta() {
                System.out.println(this.questions);
                System.out.println();
                System.out.println(this.A);
                System.out.println(this.B);
                System.out.println(this.C);
                System.out.println(this.D);
                System.out.println(this.E);
                System.out.println();
            }

            //RESPOSTA CORRETA E ERRADA
            public boolean verdadeira () {
                String resposta = leiaResposta();
                if (resposta.equalsIgnoreCase(this.correta)) {
                    System.out.println("");
                    System.out.println("-------//-------//-------//-------//-------");
                    System.out.println("Boa, é isso aí: " + this.correta);
                    return true;

                } else {
                    System.out.println("");
                    System.out.println("-------//-------//-------//-------//-------");
                    System.out.println("Resposta errada, a resposta é: " + this.correta);
                    return false;
                }
            }

            //LEITURA RESPOSTA
            public String leiaResposta() {
                Scanner ler = new Scanner(System.in);
                String r;
                do {
                    System.out.println("Escreva sua resposta: ");
                    r = ler.next();
                } while (!respostaValida(r));
                return r;

            }

            private boolean respostaValida(String resp) {
                if (resp.equalsIgnoreCase("A") ||
                        resp.equalsIgnoreCase("B") ||
                        resp.equalsIgnoreCase("C") ||
                        resp.equalsIgnoreCase("D") ||
                        resp.equalsIgnoreCase("E")) {
                    return true;
                }
                System.out.println("Digite apenas uma das alternativas: A, B, C, D ou E.");
                System.out.println("-------//-------//-------//-------//-------//-------");
                return false;
            }
        }


        int contador = 0;
        cabecalho();
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("-------//-------//-------//-------//-------");


        //QUESTÕES 1-15
        //PERGUNTA 01

        System.out.println("QUESTÃO 01: Qual dos protocolos abaixo é"+
                "responsável por controlar o fluxo de dados na Internet," +
                "dividindo grandes pacotes de dados em pacotes menores e garantindo" +
                "a entrega ordenada desses pacotes ao destino??");
        item alter1 = new item();
        alter1.A = "[A]  HTTP";
        alter1.B = "[B]  FTP";
        alter1.C = "[C]  TCP";
        alter1.D = "[D]  UDP";
        alter1.E = "[E]  SMTP";
        alter1.correta = "C";

        alter1.escrevaresposta();
        if(alter1.verdadeira()){
            contador++;
        }
        System.out.println("você acertou até agora: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        //PERGUNTA 02

        System.out.println("QUESTÃO 02: Qual dispositivo de rede é responsável" +
                " por conectar diferentes redes e realizar " +
                "o roteamento de pacotes entre elas??");

        item alter2 = new item();
        alter2.A = "[A] Hub";
        alter2.B = "[B] Switch";
        alter2.C = "[C] Roteador";
        alter2.D = "[D] Modem";
        alter2.E = "[E] Repetidor";
        alter2.correta = "B";

        alter1.escrevaresposta();
        if(alter2.verdadeira()){
            contador++;
        }
        System.out.println("você acertou até agora: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        //PERGUNTA 03

        System.out.println("QUESTÃO 03: Qual das alternativas define melhor o que é uma rede de computadores");

        item alter3 = new item();
        alter3.A = "[A] Um conjunto de dispositivos interligados capazes de compartilhar recursos e informações.";
        alter3.B = "[B] Um único computador com alta capacidade de processamento e armazenamento";
        alter3.C = "[C] Um software que permite a comunicação entre diferentes dispositivos.";
        alter3.D = "[D] Um cabo de rede utilizado para conectar diversos equipamentos";
        alter3.E = "[E] Um servidor central que controla todos os dispositivos conectados";
        alter3.correta = "A";

        alter3.escrevaresposta();
        if(alter3.verdadeira()){
            contador++;
        }
        System.out.println("você acertou até agora: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

    }
}
