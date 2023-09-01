//import da classe para realizar leitura no terminal

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // variaveis com os atributos
        int numeroDaConta;
        String agencia;
        String nomeDoCliente;
        Double saldo;

        // declaração do objeto scanner para realizar a leitura dos dados
        //utilizei locale para permitir inseriri os dados exatamente como no desafio com ponto ao inves de virgula.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);        

        System.out.println("Por favor, digite numero da conta:");
        numeroDaConta = scanner.nextInt();
        
        System.out.println("Por favor, digite numero da agencia:");
        agencia = scanner.next();        
        
        scanner.nextLine();//preciso esvaziar o buffer do teclado antes de atribuir para conseguir ler mais uma palavra
        
        System.out.println("Por favor, digite nome do cliente:");
        nomeDoCliente = scanner.nextLine();
                
        System.out.println("Por favor, digite saldo da conta:");
        saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo R$: " + saldo + " já esta disponível para saque.");
    }
}
