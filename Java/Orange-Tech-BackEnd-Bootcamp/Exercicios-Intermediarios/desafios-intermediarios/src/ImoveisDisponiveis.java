import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        //String array[] = new String[3];

        String[] array = frase.split("/");
        
        

       String imovel = array[0];
       String valor = array[1];
       String disposicao = array[2];

       System.out.println("Imovel: " + imovel + " R$"+ valor +" "+ disposicao);


     
    }

   
}