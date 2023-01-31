//Tratando unchecked exception duranto o código, antecipando possiveis interrupções por erros do usuário.

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args){

        boolean continueLooping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado é " + resultado);
                continueLooping = false;

            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Entrada invalida informe um numero inteiro / " + e.getMessage());
            }catch(ArithmeticException e){
                JOptionPane.showMessageDialog(null, "Impossível dividir um número por zero " + e.getMessage());
            }finally{
                System.out.println("Chegou mp finally");
            }
        }while(continueLooping);

        System.out.println("Código continua...");
    }
    
    public static int dividir(int a, int b) { return a/b;}    
}
