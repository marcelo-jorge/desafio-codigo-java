package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */
    public static void main(String[] args) {
    //criar uma lista
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    //Criar Function para dobra valor na lista
    Function<Integer,Integer> dobra = numero -> numero * 2;

    //imprimir usando function e reference
    List<Integer> numerosDobrados = numeros.stream().map(dobra).collect(Collectors.toList());
    numerosDobrados.forEach(System.out::println);

    //imprimir usando lambda
    List<Integer> numerosDobrados2 = numeros.stream().map(n -> n*2).collect(Collectors.toList());
    numerosDobrados2.forEach(n -> System.out.println(n));


    }
}
