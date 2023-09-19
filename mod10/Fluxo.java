import java.util.Scanner;


public class Meida_Fluxo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja saber a media da sua nota? ");
        String resposta = scanner.next();

        while (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("\nDigite a primeira nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.println("\nDigite a primeira nota : ");
            double nota2 = scanner.nextDouble();

            System.out.println("\nDigite a primeira nota 3: ");
            double nota3 = scanner.nextDouble();

            System.out.println("\nDigite a primeira nota 4: ");
            double nota4 = scanner.nextDouble();


            double resultado = (nota1 + nota2 + nota3 + nota4) / 4;

            if (resultado >= 7) {
                System.out.println("\nAluno aprovado!!");
            } else if (resultado >= 5) {
                System.out.println("\nAluno em reuperação!");
            } else {
                System.out.println("\nAluno reprovado!");
            }

            System.out.println("\nDeseja gerar novamente sua média? ");
            resposta = scanner.next();
        }

        System.out.println("\nObrigado, até a próxima!");

    }

}


//leitura de 4 nota do aluno com scanner
// imprimir no console se esta aprovado ou repovado
// valindando de é >=7 aprovado / >=5 recuperaçao / < 5 re

