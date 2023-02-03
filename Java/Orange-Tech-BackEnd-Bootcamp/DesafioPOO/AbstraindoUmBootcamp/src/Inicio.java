import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;


public class Inicio{
    public static void main(String [] args){
        Curso curso1 = new Curso(); //instanciando a classe Curso
        curso1.setTitulo("Curso introdução a Java");
        curso1.setDescricao("aprendendo java");
        curso1.setcargaHoraria(8);

        Curso curso2 = new Curso(); //instanciando a classe Curso
        curso2.setTitulo("Curso Collections java");
        curso2.setDescricao("aprendendo java");
        curso2.setcargaHoraria(4);

        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Tirando dúvidas em Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Javinha Developer");
        bootcamp.setDescricao("Aprendendo javinha do zero ou céu");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabi = new Dev();
        devGabi.setNome("Gabi");
        devGabi.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscritos Gabi: " + devGabi.getConteudosInscritos());
        
        devGabi.progredir();
        devGabi.progredir();
        System.out.println("--------");
        System.out.println("Contéudos Inscritos Gabi: " + devGabi.getConteudosInscritos());
        System.out.println("Contéudos Concluidos Gabi: " + devGabi.getConteudosConcluidos());
        System.out.println("XP: " + devGabi.calcularTotalXp());

        System.out.println("-----------------------");

        Dev devFabricio =new Dev();
        devFabricio.setNome("Fabricio");
        devFabricio.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscritos Fabricio: " + devFabricio.getConteudosInscritos());
        
        devFabricio.progredir();
        devFabricio.progredir();
        devFabricio.progredir();
        System.out.println("--------");
        System.out.println("Contéudos Inscritos Fabricio: " + devFabricio.getConteudosInscritos());
        System.out.println("Contéudos Concluidos Fabricio: " + devFabricio.getConteudosConcluidos());
        System.out.println("XP: " + devFabricio.calcularTotalXp());

        

    }
    
}
