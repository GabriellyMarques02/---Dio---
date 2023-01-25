import java.util.Scanner;

public class MaiorEMedia{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //recebendo 5 numeros e vendo quem é o maior

        int numero;
        int numeroMaior = 0;
        int soma = 0;
        
        int count=0; //contador

        do{
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > numeroMaior) numeroMaior = numero;

            count = count+1;
        }while(count < 5);
        
        System.out.println("O número maior é: " + numeroMaior);

        System.out.println("A média é:  " + soma/5);
   
    }

}