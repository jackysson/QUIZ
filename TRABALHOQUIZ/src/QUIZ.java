import java.util.Scanner;

class Quiz {

    private static System String;

    public static void cabecalho() {

        System.out.println("Faculdade: Unifan.");
        System.out.println("Aluno: Jackysson willyan Rios Mota.");
        System.out.println("Professor: Brenno.");
        System.out.println("Matéria: Programação II.");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("Bem vindo ao QUIZ." +
                "você irá ser testado sobre seus conhecimetos em redes de internet" +
                "boa sorte");

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

        //PERGUNTA 04

        System.out.println("QUESTÃO 03:  Qual é a principal função do protocolo TCP/IP?");

        item alter4 = new item();
        alter4.A = "[A] Gerenciar o tráfego de dados em uma rede local";
        alter4.B = "[B] Converter dados digitais em sinais analógicos para transmissão.";
        alter4.C = "[C] Garantir a segurança da comunicação entre dispositivos.";
        alter4.D = "[D] Dividir dados em pacotes e garantir a entrega correta.";
        alter4.E = "[E] Criar páginas web e torná-las acessíveis na internet.";
        alter4.correta = "D";

        alter4.escrevaresposta();
        if(alter4.verdadeira()){
            contador++;
        }
        System.out.println("você acertou até agora: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        //PERGUNTA 05

        System.out.println("QUESTÃO 05:  Qual das seguintes topologias de rede " +
                "é caracterizada por um único ponto central ao " +
                "qual todos os dispositivos estão conectados?");

        item alter5 = new item();
        alter5.A = "[A] Barramento";
        alter5.B = "[B] Estrela";
        alter5.C = "[C] Anel";
        alter5.D = "[D] Malha";
        alter5.E = "[E] Híbrida";
        alter5.correta = "B";

        alter5.escrevaresposta();
        if(alter5.verdadeira()){
            contador++;
        }
        System.out.println("você acertou até agora: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

         //PERGUNTA 06

        System.out.println("QUESTÃO 06:  O que é um endereço IP?");

        item alter6 = new item();
        alter6.A = "[A] Um nome único atribuído a cada dispositivo em uma rede.";
        alter6.B = "[B] Um número que identifica um dispositivo em uma rede.";
        alter6.C = "[C] Um protocolo utilizado para enviar e-mails.";
        alter6.D = "[D] Um tipo de cabo de rede";
        alter6.E = "[E] Um software que permite a navegação na internet.";
        alter6.correta = "B";

        alter6.escrevaresposta();
        if(alter6.verdadeira()){
            contador++;
        }
        System.out.println("você acertou até agora: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

           //PERGUNTA 07

        System.out.println("QUESTÃO 07:  Qual é a principal diferença entre uma LAN e uma WAN?");

        item alter7 = new item();
        alter7.A = "[A] A LAN é maior e mais rápida que a WAN.";
        alter7.B = "[B] A LAN abrange uma área geográfica maior que a WAN.";
        alter7.C = "[C] A LAN utiliza tecnologias wireless, enquanto a WAN utiliza cabos.";
        alter7.D = "[D] A LAN conecta dispositivos em uma área local, enquanto a WAN conecta redes distantes ";
        alter7.E = "[E] A LAN é utilizada para redes domésticas, enquanto a WAN é utilizada para redes empresariais.";
        alter7.correta = "D";

        alter7.escrevaresposta();
        if(alter7.verdadeira()){
            contador++;
        }
        System.out.println("você acertou até agora: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

         //PERGUNTA 08

        System.out.println("QUESTÃO 08:  Qual protocolo é utilizado para enviar e receber e-mails?");

        item alter8 = new item();
        alter8.A = "[A] HTTP";
        alter8.B = "[B] FTP";
        alter8.C = "[C] SMTP";
        alter8.D = "[D] DNS ";
        alter8.E = "[E] POP3";
        alter8.correta = "C";

        alter8.escrevaresposta();
        if(alter8.verdadeira()){
            contador++;
        }
        System.out.println("você acertou até agora: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        //PERGUNTA 09

        System.out.println("QUESTÃO 09:  O que é um firewall?");

        item alter9 = new item();
        alter9.A = "[A] Um dispositivo de hardware ou software que monitora o tráfego de rede e bloqueia acessos não autorizados.";
        alter9.B = "[B] Um programa utilizado para navegar na internet.";
        alter9.C = "[C] Um tipo de vírus de computador";
        alter9.D = "[D] Um protocolo utilizado para transferir arquivos. ";
        alter9.E = "[E] Um cabo de rede de alta velocidade.";
        alter9.correta = "A";

        alter9.escrevaresposta();
        if(alter9.verdadeira()){
            contador++;
        }
        System.out.println("você acertou até agora: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

         //PERGUNTA 10

        System.out.println("QUESTÃO 10: Qual é a principal função do protocolo DNS?");

        item alter10 = new item();
        alter10.A = "[A] Converter nomes de domínio em endereços IP..";
        alter10.B = "[B] Garantir a segurança da comunicação na internet.";
        alter10.C = "[C] Dividir dados em pacotes para transmissão.";
        alter10.D = "[D] Gerenciar o tráfego de dados em uma rede local. ";
        alter10.E = "[E] Criar páginas web e torná-las acessíveis na internet.";
        alter10.correta = "A";

        alter10.escrevaresposta();
        if(alter10.verdadeira()){
            contador++;
        }
        System.out.println("você acertou até agora: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        //PERGUNTA 11

        System.out.println("QUESTÃO 11: O que é uma VPN?");

        item alter11 = new item();
        alter11.A = "[A] Uma rede privada virtual que permite a conexão segura a uma rede remota.";
        alter11.B = "[B] Um tipo de vírus de computador.";
        alter11.C = "[C] Um dispositivo de hardware utilizado para conectar redes.";
        alter11.D = "[D] Um protocolo utilizado para transferir arquivos. ";
        alter11.E = "[E] Um software que permite a navegação anônima na internet.";
        alter11.correta = "A";

        alter10.escrevaresposta();
        if(alter11.verdadeira()){
            contador++;
        }
        System.out.println("você acertou até agora: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");

        //PERGUNTA 12

        System.out.println("QUESTÃO 12:  Qual das seguintes opções NÃO é um tipo de ataque cibernético?");

        item alter12 = new item();
        alter12.A = "[A] Phishing";
        alter12.B = "[B] DDoS";
        alter12.C = "[C] Malware";
        alter12.D = "[D] Firewall ";
        alter12.E = "[E] Engenharia social";
        alter12.correta = "D";

        alter10.escrevaresposta();
        if(alter12.verdadeira()){
            contador++;
        }
        System.out.println("você acertou até agora: " +contador+"/15");
        System.out.println("-------//-------//-------//-------//-------");
        System.out.println("");


    }
}
