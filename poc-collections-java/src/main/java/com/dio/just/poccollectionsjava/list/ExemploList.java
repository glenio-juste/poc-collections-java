package com.dio.just.poccollectionsjava.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Garante a ordem de inserção
 * Permite adição, atualização, leitura e remoção sem regras adicionais
 * Permite ordenação através de comparators
 */

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");

        // inserindo o Glenn na posição 1, depois do Carlos
        nomes.set(1, "Glenn");

        System.out.println(nomes);

        // ordem alfabética
        Collections.sort(nomes);

        // setando a Zizao na posição 1, no lugar do Glenn
        nomes.set(1, "Zizao");

        System.out.println("===> " + nomes);

        // qual o índice de Zizao
        int posicao = nomes.indexOf("Zizao");
        System.out.println(posicao);

        // verificar posição do Teste na lista
        int posicao2 = nomes.indexOf("Teste");
        System.out.println(posicao2); // retorna -1

        // remove por indice
        nomes.remove(4);

        System.out.println(nomes);

        // removendo por objeto(elemento em si)
        nomes.remove("Zizao");

        System.out.println(nomes);

        String nombre = nomes.get(2);
        System.out.println(nombre);

        // tamanho da lista
        int tamanho = nomes.size();
        System.out.println(tamanho);

        // verificando se contém juliana
        boolean temJuliana = nomes.contains("Juliana");
        System.out.println(temJuliana);

        // verificando se contém Carlos
        boolean temCarlos = nomes.contains("Carlos");
        System.out.println(temCarlos);

        // foreach
        //tipo var_create : listacriada
        for(String nome : nomes){
            System.out.println("O nome é: " + nome);
        }

        //iterator
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("Interator: " + iterator.next());
        }

        // limpar toda lista
        nomes.clear();

        // verificar se a lista está vazia
        boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);

    }

}
