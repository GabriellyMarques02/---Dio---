import java.util.Scanner;

public class ParEImpar{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

    //recebendo N numeros para calcular e mostrar a quantidade de numeros pares e impares

        int numero;
        int quantidadeNumeros;
        int quantidadePares =0, quantidadeImpares = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;

        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0 )quantidadePares++;

            else quantidadeImpares++;


            count++;

        }while(count < quantidadeNumeros);

        System.out.println("Essa é a quantidade de números pares: " + quantidadePares);
        System.out.println("Essa é a quantidade de números impares: " + quantidadeImpares);

    }
}
