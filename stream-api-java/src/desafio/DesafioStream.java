package desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DesafioStream {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

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
        //para remover precisa ser arraylist
        List<Integer> numerosImpares = new ArrayList<>(numeros);
        System.out.println("Remova todos os valores ímpares:");
        numerosImpares.removeIf(n -> n % 2 != 0);
        System.out.println(numerosImpares);

        // Desafio 5 - Calcule a média dos números maiores que 5:
        System.out.println("Calcule a média dos números maiores que 5:");
        System.out.println(numeros.stream().filter(n -> n>5).mapToInt(Integer::intValue).average().orElse(0));

        // Desafio 6 - Verificar se a lista contém algum número maior que 10:
        System.out.println("Verificar se a lista contém algum número maior que 10:");
        System.out.println(numeros.stream().anyMatch(n -> n > 10));

        // Desafio 7 - Encontrar o segundo número maior da lista:
        System.out.println("Encontrar o segundo número maior da lista:");
        System.out.println(numeros.stream()
                            .distinct()
                            .sorted(Comparator.reverseOrder())
                            .skip(1)
                            .findFirst()
                            .orElse(null));
        // System.out.println(numeros.stream()
        //                     .sorted()
        //                     .distinct()
        //                     .collect(Collectors.toList())
        //                     .get(numeros.size()-2));
        
        // Desafio 8 - Somar os dígitos de todos os números da lista:
        System.out.println("Somar os dígitos de todos os números da lista:");
        List<String> numerosString = numeros.stream().map( n -> n.toString()).collect(Collectors.toList());
        int somaDigitos = 0;
        for (String string : numerosString) {
            somaDigitos = somaDigitos + string.length();
        }
        System.out.println("Soma dos digitos é: " + somaDigitos);
        
        
        // Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
        System.out.println("Verificar se todos os números da lista são distintos (não se repetem):");
        boolean distintos = numeros.stream().distinct().count() == numeros.size();
        System.out.println("Todos numeros da lista são distintos: " + distintos);
        
        // Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        System.out.println(numeros.stream()
                    .filter(n -> n%2 != 0)
                    .collect(Collectors.groupingBy(n -> (n%3 == 0) || (n%5 == 0)))
                    );
        
        //Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
        System.out.println("Encontre a soma dos quadrados de todos os números da lista:");
        System.out.println(numeros.stream().map(n -> n*n).reduce(0,Integer::sum));

        // Desafio 12 - Encontre o produto de todos os números da lista:
        System.out.println("Encontre o produto de todos os números da lista:");        
        System.out.println(numeros.stream().reduce(1, (n1,n2) -> n1*n2));

        // Desafio 13 - Filtrar os números que estão dentro de um intervalo:
        System.out.println("Filtrar os números que estão dentro de um intervalo: 2 e 4");
        System.out.println(numeros.stream().filter(n -> n>=2 && n<=4).collect(Collectors.toList()));

        // Desafio 14 - Encontre o maior número primo da lista:
        System.out.println("Encontre o maior número primo da lista:");
        System.out.println(numeros.stream()
                            .filter(n -> (n%2!=0 && n%3!=0) || (n==2 || n==3))
                            .sorted(Comparator.reverseOrder())
                            .findFirst()
                            .orElse(null));

        // Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
        System.out.println("Verifique se a lista contém pelo menos um número negativo:");
        System.out.println(numeros.stream().anyMatch(n -> n<0));

        // Desafio 16 - Agrupe os números em pares e ímpares:
        System.out.println("Agrupe os números sendo true para Par e false Impar:");        
        System.out.println(numeros.stream().collect(Collectors.groupingBy(n -> n%2==0)));

        // Desafio 17 - Filtrar os números primos da lista:
        System.out.println("");

        // Desafio 18 - Verifique se todos os números da lista são iguais:

        // Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
    }
}
