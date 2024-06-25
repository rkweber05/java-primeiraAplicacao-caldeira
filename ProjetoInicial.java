import java.util.Scanner;

public class ProjetoInicial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("****************************************************");
        System.out.println("Dados inicias do cliente: ");
        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Tipo da conta: ");
        String tipoConta = scanner.nextLine();

        System.out.print("Saldo Inicial: ");
        double saldoInicial = scanner.nextDouble();
        System.out.println("****************************************************");

        System.out.println("\nOperações:");

        System.out.println("1- Consultar saldo");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("3- Sair");

        System.out.print("\nDigite a opção desejada:");
        double valor = 0.0;
        int operacao = 0;

        while (operacao != 4) {
            operacao = scanner.nextInt();
            if (operacao == 1) {
                System.out.println("Saldo atual = R$ " + saldoInicial);
                System.out.print("Qual outra operação deseja:");
            } else if (operacao == 2) {
                System.out.println("Quanto irá receber? ");
                valor = scanner.nextDouble();
                System.out.println("Recebimento de valor de R$ " + valor);
                saldoInicial += valor;
                System.out.println("Saldo atual = R$ " + saldoInicial);
                System.out.print("Qual outra operação deseja:");
            } else if (operacao == 3) {
                System.out.print("Quanto sera transferido? ");
                valor = scanner.nextDouble();

                if (valor > saldoInicial) {
                    System.out.println("Valor não pode ser transferido");
                    System.out.print("Qual outra operação deseja:");
                } else {
                    System.out.println("Valor transferido de R$ " + valor);
                    saldoInicial -= valor;
                    System.out.println("Saldo atual = R$ " + saldoInicial);
                    System.out.print("Qual outra operação deseja:");
                }
            } else if (operacao == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Número não encontrado no menu, digite entre 1 - 4");
                System.out.println("Qual outra operação deseja:");
            }
        }
    }
}
