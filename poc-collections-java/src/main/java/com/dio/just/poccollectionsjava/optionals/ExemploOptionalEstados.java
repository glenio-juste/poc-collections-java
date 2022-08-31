package com.dio.just.poccollectionsjava.optionals;

import java.util.Optional;

public class ExemploOptionalEstados {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor Presente!");

        System.out.println("Valor opcional está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está preente"));
                   //  se está presente ou senão (...)

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor opcional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null -> não está presente!"));

                                               // vazio
        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor opcional que não está presente!");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty -> não está presente"));

        //Optional<String> optionalNullError = Optional.of(null);

        System.out.println("Valor opcional que lança erro NullPointerExceptio!");
        //optionalNullError.ifPresentOrElse(System.out::println, () -> System.out.println("Error -> não está presente"));

    }

}
