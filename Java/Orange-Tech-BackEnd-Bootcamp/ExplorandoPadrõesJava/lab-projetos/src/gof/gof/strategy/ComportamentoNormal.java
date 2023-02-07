package gof.strategy;

public class ComportamentoNormal  implements Comportamento{
    @Override
    public void mover(){
        System.out.println("Estou me movendo normalmente...");
    }
    
}
