package com.dio.just.poccollectionsjava.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet
 *
 * Quando é necessário alterar a ordem através do uso de comparators
 * Mantém a ordem e pode ser reordenado
 * É performático para leitura
 * Para modificação tem a necessidade de reordenar, sendo mais lento que o LinkedHashSet
 */

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        // manta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        // retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        // retorna a última capital no final da árvore
        System.out.println(treeCapitais.last());

        // retorna a primeira capital abaixo na árvore parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        // retorna a primeira capital acima na árvore parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        System.out.println(treeCapitais);

        // retorna a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        // retorna a última capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

        // navega em todos os itens do Iterator
        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String capital : treeCapitais){
            System.out.println(capital);
        }

    }

}
