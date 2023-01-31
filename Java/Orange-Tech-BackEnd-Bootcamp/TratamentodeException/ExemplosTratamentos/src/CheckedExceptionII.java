// Exemplo de Checked exception com manipulação de arquivos (Imprimindo arquivo no console)

//import javax.swing.*;
import java.io.*;

import javax.swing.JOptionPane;

public class CheckedExceptionII{
    public static void main(String[] args){
        //String nomeDoArquivo = "teste.txt";// jeito certo
        String nomeDoArquivo = "tete.txt"; // testagem de exception

        try {
            ImprimirArquivoNoConsole(nomeDoArquivo);
        } catch(FileNotFoundException e){ // erro generico 
            JOptionPane.showMessageDialog(null,
            "Revise o nome do arquivo que você deseja imprimir! / " + e.getCause());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
            "Ocorreu um erro inesperado! Notifique o suporte! / " + e.getCause());
            e.printStackTrace();            
        }finally{
            System.out.println("Chegou no finally");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");   
       
    }
    public static void ImprimirArquivoNoConsole(String nomeDoArquivo) throws IOException{ // throws deixa as exceções passarem
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        }while(line !=null);
        bw.flush(); //é usado para limpar o console e forçar qualquer saída armazenada em buffer a ser escrita imediatamente.
        br.close();

    }
    
}
