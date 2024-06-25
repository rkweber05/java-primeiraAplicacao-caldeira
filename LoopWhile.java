import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Diga qual a sua avaliaçõa do filme");
            nota = scanner.nextDouble();

            if (nota != -1) {
                media += nota;
                totalNotas++;
            }
        }

        System.out.println(media);
        System.out.println("media avaliação " + media / totalNotas);
    }
}
