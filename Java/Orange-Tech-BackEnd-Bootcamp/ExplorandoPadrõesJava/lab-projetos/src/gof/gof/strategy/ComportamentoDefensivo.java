package gof.strategy;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover(){
        System.out.println("Estou me movendo defensivamente...");
    }
    
}
