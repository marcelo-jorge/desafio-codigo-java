package desafio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DesafioStream {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        //Desafio 1 - Mostre a lista na ordem numérica:
        System.out.println("Mostre a lista na ordem numérica:");
        numeros.stream().sorted().forEach(System.out::print);
        System.out.println();

        // Desafio 2 - Imprima a soma dos números pares da lista:
        System.out.println("Imprima a soma dos números pares da lista:");        
        System.out.println(numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum));

        // Desafio 3 - Verifique se todos os números da lista são positivos:
        System.out.println("Verifique se todos os números da lista são positivos:");
        System.out.println(numeros.stream().allMatch(n -> n >= 0));
        
        // Desafio 4 - Remova todos os valores ímpares:
        System.out.println("Remova todos os valores ímpares:");
        // Desafio 5 - Calcule a média dos números maiores que 5:
        // Desafio 6 - Verificar se a lista contém algum número maior que 10:
        // Desafio 7 - Encontrar o segundo número maior da lista:
        // Desafio 8 - Somar os dígitos de todos os números da lista:
        // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        // Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
    }
}
