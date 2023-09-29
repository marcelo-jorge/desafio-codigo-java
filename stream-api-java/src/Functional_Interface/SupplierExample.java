package Functional_Interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
    public static void main(String[] args) {
    //Criando Supplier para imprimir na tela
    Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

    //imprimindo a mensagem 5 vezes
    List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).collect(Collectors.toList());    

    //imprimindo saudações
    listaSaudacoes.forEach(System.out::println);
    }
}
