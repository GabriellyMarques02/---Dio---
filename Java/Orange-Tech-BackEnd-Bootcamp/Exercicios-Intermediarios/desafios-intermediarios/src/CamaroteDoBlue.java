import java.util.Scanner; 

public class CamaroteDoBlue {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        
        if(tamanhoDaFila % 2 == 0){
            pessoasNoCamarote = tamanhoDaFila/2;
            System.out.println(pessoasNoCamarote + " pessoas no camarote");
        }else{
            pessoasNoCamarote = 1;
            pessoasNoCamarote = pessoasNoCamarote + (tamanhoDaFila/2);
            System.out.println(pessoasNoCamarote + " pessoas no camarote");
        }
        
            
    }
}

