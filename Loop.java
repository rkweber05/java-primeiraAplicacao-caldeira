import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga qual a sua avaliaçõa do filme");
            nota = scanner.nextDouble();
            media += nota;
        }

        System.out.println(media);
        System.out.println("media avaliação " + media/3);
    }
}
