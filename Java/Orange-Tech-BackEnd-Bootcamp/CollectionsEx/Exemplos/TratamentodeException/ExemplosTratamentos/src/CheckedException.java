// Exemplo de Checked exception com manipulação de arquivos (Imprimindo arquivo no console)

//import javax.swing.*;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) throws IOException{
        String nomeDoArquivo = "teste.txt";
        ImprimirArquivoNoConsole(nomeDoArquivo);

        System.out.println("Apesar da exception ou não, o programa continua...");   
       
    }
    public static void ImprimirArquivoNoConsole(String nomeDoArquivo) throws IOException{
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
