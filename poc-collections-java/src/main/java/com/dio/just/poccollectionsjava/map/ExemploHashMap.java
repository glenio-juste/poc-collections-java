package com.dio.just.poccollectionsjava.map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 *
 * Entrada de chave e valor
 * Permite valores repetidos, mas não permite repetição de chave
 * Permite a adição, busca por chave ou valor, atualização, remoção e navegação
 * Pode ser ordenado
 */

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        // adiciona campeões mundiais fifa no mapa
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Italia", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        // atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);

        System.out.println(campeoesMundialFifa);

        // retorna a Argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        // retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        // remove o campeão França
        campeoesMundialFifa.remove("França");

        // retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        // retorna se existe ou não alguma seleção hexa campeão
        System.out.println(campeoesMundialFifa.containsValue(6));

        // retorna o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());

        System.out.println(campeoesMundialFifa);

        // navega nos registros do mapa
        for(Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey() + " == " + entry.getValue());
        }

        // navega nos registros do mapa
        for(String key : campeoesMundialFifa.keySet()){
            System.out.println(key + " ==> " + campeoesMundialFifa.get(key));
        }

        System.out.println(campeoesMundialFifa);

        // verifica se o mapa contém a chave Estados Unidos
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        // verifica se existe o valor 5
        System.out.println(campeoesMundialFifa.containsValue(5));

        // verifica o tamanho antes de depois de limpar o mapa
        System.out.println(campeoesMundialFifa.size());

        campeoesMundialFifa.clear();

        System.out.println(campeoesMundialFifa.size());

    }

}
