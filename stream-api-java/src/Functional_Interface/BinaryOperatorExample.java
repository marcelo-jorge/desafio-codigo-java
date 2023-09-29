package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */
    public static void main(String[] args) {
        //cria lista
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Cria BinaryOperator para somar dois numeros
        BinaryOperator<Integer> somar = (n1,n2) -> n1+n2;

        //imprimir usando BinaryOperator
        System.out.println(numeros.stream().reduce(0, somar));

        //imprimir usando reference
        System.out.println(numeros.stream().reduce(0, Integer::sum));

        //imprimir usando lambda
        System.out.println(numeros.stream().reduce(0, (n1,n2) -> n1+n2));
    }    
}
