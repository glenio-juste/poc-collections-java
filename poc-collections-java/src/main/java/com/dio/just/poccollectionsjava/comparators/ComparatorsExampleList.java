package com.dio.just.poccollectionsjava.comparators;

import java.util.*;

/**
 * Comparators
 *
 * java.util.Comparator -> Interface para definir classe com regra de ordenação
 * java.util.Comparable -> Interface para definir regra de ordenação em uma classe de domínio
 *
 * Algortimos de ordenação
 * Utilizando primairamente em java.util.List
 * Permite a ordenação de objetos complexos (criados pelo usuário)
 */

public class ComparatorsExampleList {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        System.out.println("--- Ordem de Inserção ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade() );

        System.out.println("--- Ordem natural dos natural - idade ---");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());

        System.out.println("--- Ordem reserva dos números - idade ---");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));

        System.out.println("--- Ordem natural dos números - idade (method reference) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes);

        System.out.println("--- Ordem natural dos números - idade (interface Comparable) ---");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemIdadeReservaComparator());

        System.out.println("--- Ordem natural dos números - idade (Interface Comparator) ---");
        System.out.println(estudantes);

    }

}
