import dominio.*;

import java.time.LocalDate;


public class Inicio{
    public static void main(String [] args){
        Curso curso1 = new Curso(); //instanciando a classe Curso
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("aprendendo java");
        curso1.setcargaHoraria(8);

        Curso curso2 = new Curso(); //instanciando a classe Curso
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("aprendendo js");
        curso2.setcargaHoraria(4);

        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Tirando dúvidas em Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
    
}
