package Functional_Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
    public static void main(String[] args) {
        //lista de palavras
        List<String> palavras = Arrays.asList("java","kotlin","python", "javascript", "c", "go", "ruby");

        //Cria Predicate para verificar qual palvra tem mais de 5 letras
        Predicate<String> maisdeCincoCaracteres = palavra -> palavra.length() > 5;

        //imprimindo com Predicate
        palavras.stream().filter(maisdeCincoCaracteres).forEach(System.out::println);

        //imprimindo com lambda
        palavras.stream().filter(p -> p.length() > 5).forEach(p -> System.out.println(p));
    }    
}
