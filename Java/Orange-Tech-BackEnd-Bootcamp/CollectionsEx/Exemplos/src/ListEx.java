/*Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6],
faça: */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListEx {
   public static void main(String[] args){

        System.out.print("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        //System.out.println(notas); também exibe as notas da lista
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: "+ notas.indexOf(5d));
        
        System.out.println("Adicione na Lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.print(notas.toString());

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        
        //imprimindo em formato de lista, pulando linha
        for(Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota selecionada: " + notas.get(2));
       
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //Somando dentro da lista usando o metodo iterator
        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while(iterator.hasNext()){ // pergunta iterator se tem proximo
            Double next =  iterator.next();
            soma+=next;
        }

        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota  da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }

        System.out.println(notas);

        /*System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);*/

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
        


      
        




        

    }


    
}
