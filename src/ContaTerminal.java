import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------BANCO JAVA--------------");
        System.out.println("Olá, qual é o seu nome? ");
        String nomeCliente = scanner.nextLine();

        System.out.println("---------------------------");
        System.out.println("Qual número da agência gostaria de abrir a conta?");
        String agencia = scanner.nextLine();

        System.out.println("---------------------------");
        System.out.println("Digite o número da conta:");
        String numeroStr = scanner.nextLine(); // Lê como uma String

        int numero = Integer.parseInt(numeroStr);

        System.out.println("---------------------------");
        System.out.println("Gostaria de efetuar um depósito inicial? Se sim, informe o valor; se não, digite 0 (zero):");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("---------------------------");
        System.out.println("");

        String mensagem = "Olá " + 
        nomeCliente.concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia)
        .concat(", conta ").concat(String.valueOf(numero)).concat(" e seu saldo R$").concat(String.valueOf(saldo))
        .concat(" já está disponível para saque.");

        System.out.println(mensagem);

        scanner.close();


        
    }
}
