package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample{
    public static void main(String[] args) {
        //Lista de numero
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Criando Consumer para imprimir numeros pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };
        
        //utilizando Consumer
        numeros.forEach(imprimirNumeroPar);
        
        //Utilizando lambda
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}