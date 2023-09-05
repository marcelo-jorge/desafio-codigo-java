import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        // Classe scanner utilizada para ler no terminal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // solicita ao usuario o primeiro numero inteiro
        System.out.println("digite o primeiro numero inteiro: ");
        int n1 = scanner.nextInt();

        // solicita ao usuario o segundo numero inteiro
        System.out.println("digite o segundo numero inteiro maior: ");
        int n2 = scanner.nextInt();

        // realizar uma tentativa pra o metodo contar
        try {

            contar(n1, n2);            

        // caso o primeiro numeo seja maior que o segundo lançara uma exceção
        } catch (ParametrosInvalidosException pie) {
            // busca a mensagem sobrecarregada na classe de exceções. 
            System.out.println(pie.getMessage());
        }
        
    }

    static void contar(int n1,int n2)throws ParametrosInvalidosException{

        // executa uma verificação, em caso de verdadeiro lançara uma exceção
        if(n1 > n2)
            throw new ParametrosInvalidosException();

        //caso a exceção não seja lançada executa o resto do codigo
        int contador = n2-n1;
        for(int i=1 ; i<=contador ; i++){
            System.out.println("imprimindo numero: " + i );
        }

    }
}
