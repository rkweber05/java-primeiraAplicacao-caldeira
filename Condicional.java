public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2024;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoLancamento > 2024) {
            System.out.println("Filme Lançamento");
        } else {
            System.out.println("Ano igual a 2024 ou menor!");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado !");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
