/*Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6],
 faça:
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetEx7notas {
    public static void main(String[] args){

    
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

       //Set não tem indice logo não tem como imprimir a posição, adicionar na posição ou substituir

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        //collections.max e collections min, funcionam com o set.

        //Soma com interator funciona também (mesmo do exemplo ListEx).

        //Média funciona com set

        // Size também

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas.toString());

        //Remova notas menores que 7, por exemplo funciona do mesmo jeito que ListEx.

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2.toString());

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2); //notas2 tem o comparable por isso funciona
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira sse o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira sse o conjunto está vazio: " + notas2.isEmpty());
        System.out.println("Confira sse o conjunto está vazio: " + notas3.isEmpty());

























       



    
    
    
    }    
}
