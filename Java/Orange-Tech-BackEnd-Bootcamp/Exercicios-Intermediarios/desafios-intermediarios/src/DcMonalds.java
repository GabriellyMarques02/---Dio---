import java.util.Scanner; 

public class DcMonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        //String listaIngredientes[] = new String[3];
        
        String[] listaIngredientes = ingredientes.split(";");

        String ingrediente1 = listaIngredientes[0];
        String ingrediente2 = listaIngredientes[1];
        String ingrediente3 = listaIngredientes[2];
        String ingrediente4 = listaIngredientes[3];

        System.out.println(ingrediente1);
        System.out.println(ingrediente2);
        System.out.println(ingrediente3);
        System.out.println(ingrediente4);
    }
    
}
