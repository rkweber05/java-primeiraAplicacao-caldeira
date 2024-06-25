import java.util.Locale;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do filme");
        String filme = scanner.nextLine(); // leitura de string

        System.out.println("Ano lançamento = ");
        int anoLancamento = scanner.nextInt();

        System.out.println("Diga qual a sua avaliaçõa do filme");
        double avaliacao = scanner.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);
    }
}
