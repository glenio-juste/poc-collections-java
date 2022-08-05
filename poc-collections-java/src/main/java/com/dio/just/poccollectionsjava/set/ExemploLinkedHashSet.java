package com.dio.just.poccollectionsjava.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * LinkedHashSet
 *
 * Quando é necessário manter a ordem de inserção dos elementos
 * É a implementação mais lenta por ser necessária manter a ordem
 */

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // adiciona os números no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        // remove o número do set
        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        // retorna a quantidade de intens do set
        System.out.println(sequenciaNumerica.size());

        // navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()){
            System.out.println("Iterator => " + iterator.next());
        }

        for (Integer numero : sequenciaNumerica){
            System.out.println("ForEach => " + numero);
        }

        sequenciaNumerica.clear();

        // retorna se o set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());

    }

}
