package com.dio.just.poccollectionsjava.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Garante ordem de inserção
 * Permite adição, leitura e remoção considerando a regra básica de uma fila:
 * O primeiro que entra é o primeiro que sai
 *
 * Não permite mudança de ordenação
 *
 * Pode ser comparado ao workflow de envio de e-mail,
 * sequência de envio de aprovações por e-mail
 * primeiro e-mail vai para o aprovador e depois de aprovado,
 * o segundo e-mail vai para o aprovador
 */

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        // remove a Patrícia
        String clienteASerAtendido = filaBanco.poll();
        // imprime o elemento a ser removido
        System.out.println(clienteASerAtendido);

        System.out.println(filaBanco);

        // recupera, mas não remove, o cabeçalho desta fila ou retorna null se esta fila estiver vazia
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        // para simular o erro do element()
        //filaBanco.clear();

        /**
         * Recupera, mas não remove, o cabeçalho dessa fila. Esse método difere
         * de peek apenas porque lança uma exceção se essa fila estiver vazia
         */
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);


        for(String client : filaBanco){
            System.out.println("ForEach: " + client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("Iterator: " + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        filaBanco.clear();
        // isEmpty ?
        System.out.println(filaBanco.isEmpty());

    }

}
