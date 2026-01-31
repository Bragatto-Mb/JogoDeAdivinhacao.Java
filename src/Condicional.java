public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2023; // Adicione a declaração da variável que faltava
        boolean inclusoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento > 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        // Remova a chave que estava aqui (linha 14 da imagem)

        if (inclusoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme Liberado!");
        } else {
            System.out.println("Deve pagar a locação!");
        }
    } // Esta chave agora fecha o método main corretamente
} // Esta chave fecha a classe