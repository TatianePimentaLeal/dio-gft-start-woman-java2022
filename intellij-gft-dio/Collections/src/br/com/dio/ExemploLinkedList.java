package br.com.dio;

import java.util.LinkedList;
import java.util.List;

      /*
        Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
       */

public class ExemploLinkedList {

    public static void main (String [] args) {

        List<Double> notas2 = new LinkedList<Double>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);

        /*
        Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
       */

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.remove(0));
        System.out.println(notas2);

    }
}
