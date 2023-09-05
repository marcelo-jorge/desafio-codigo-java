import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite o primeiro numero inteiro: ");
        int n1 = scanner.nextInt();

        System.out.println("digite o segundo numero inteiro maior: ");
        int n2 = scanner.nextInt();

        try {
            contar(n1, n2);            
        } catch (ParametrosInvalidosException pie) {
            System.out.println(pie.getMessage());
        }
        
    }

    static void contar(int n1,int n2)throws ParametrosInvalidosException{

        if(n1 > n2)
            throw new ParametrosInvalidosException();

        int contador = n2-n1;
        for(int i=1 ; i<=contador ; i++){
            System.out.println("imprimindo numero: " + i );
        }

    }
}
