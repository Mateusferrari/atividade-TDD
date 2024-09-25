package app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int numeroPresentes = scanner.nextInt();
        int[] pesosPresentes = new int[numeroPresentes];

        for (int i = 0; i < numeroPresentes; i++) {
            pesosPresentes[i] = scanner.nextInt();
        }


        if (podeEquilibrar(pesosPresentes, 0, 0)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        scanner.close();
    }

    public static boolean podeEquilibrar(int[] pesos, int ladoA, int ladoB) {
        if (Math.abs(ladoA - ladoB) > 5) {
            return false;
        }
        if (pesos.length == 0) {
            return true;
        }

        int pesoAtual = pesos[0];
        int[] novosPesos = new int[pesos.length - 1];
        System.arraycopy(pesos, 1, novosPesos, 0, pesos.length - 1);

        return podeEquilibrar(novosPesos, ladoA + pesoAtual, ladoB) ||
                podeEquilibrar(novosPesos, ladoA, ladoB + pesoAtual);
    }
}