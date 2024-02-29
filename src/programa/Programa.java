package programa;

import entidades.Produto;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Programa app = new Programa();
        app.start();
    }

    private void start() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Produto[] vect = new Produto[n];

        for (int i = 0; i < vect.length; i++) {
            String nome = scanner.nextLine();
            double preco = scanner.nextDouble();
            scanner.nextLine();
            vect[i] = new Produto(nome,preco);

        }
        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPreco();

        }
        double media = soma / vect.length;

        System.out.println(media);
    }
}
