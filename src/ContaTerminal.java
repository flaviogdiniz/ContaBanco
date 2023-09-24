import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        
        
        
        

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = entrada.next();

        System.out.println("Por favor, digite o numero da agência!");
        String agencia = entrada.next();

        System.out.println("Por favor, digite o numero da conta!");
        int numero = entrada.nextInt();

        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o seu saldo " + saldo + " já está disponível para saque." );
    }
}
