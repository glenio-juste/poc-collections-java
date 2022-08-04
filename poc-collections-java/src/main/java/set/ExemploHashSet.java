package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HasSet
 *
 * Não é necessário manter a ordenação
 * Não é ordenado e não permite valores repetidos
 * Por não ter repetição de valores e não ser ordenado,
 * a implementação é mais performática
 */

public class ExemploHashSet {

    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        // Adiciona as notas no set

        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        // remover a nota do set
        notasAlunos.remove(3.8);

        System.out.println(notasAlunos);

        // retorna a quantidade de itens do set
        System.out.println(notasAlunos.size());

        // navega em todos os itens do Iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(Double nota: notasAlunos){
            System.out.println(nota);
        }

        notasAlunos.clear();

        // retorna se o set está vazio ou não
        System.out.println(notasAlunos.isEmpty());

    }

}
