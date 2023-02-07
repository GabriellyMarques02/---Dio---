package gof.strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover(){
        System.out.println("Estou me movendo agressivamente...");
    }
    
}
