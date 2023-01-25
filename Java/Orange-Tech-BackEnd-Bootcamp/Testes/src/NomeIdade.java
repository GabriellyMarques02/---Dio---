import java.util.Scanner;

public class NomeIdade{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // pedindo entrada de dados

        String nome;
        int idade;

        while(true){
            System.out.println("Seu nome: ");
            nome = scan.next();
            if(nome.equals("0"))break;

            System.out.println( "Sua idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");

    }

}