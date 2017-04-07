package pi060417;

import java.util.Scanner;

public class ExTipos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String tipo;
        double temp;
        System.out.print("Tipo do material: ");
        tipo = leitor.next();
        tipo = tipo.toUpperCase();
        System.out.print("Temperatura: ");
        temp = leitor.nextDouble();
        boolean podeTransportar;
        switch (tipo) {
            case "A":
                if (temp >= 10 && temp <= 17) {
                    System.out.println("O material pode ser transportado");
                } else {
                    System.out.println("O material não pode ser transportado");
                }
                break;
            case "B":
                if (temp >= 11 && temp <= 16) {
                    System.out.println("O material pode ser transportado.");
                } else {
                    System.out.println("O material não pode ser transportado.");
                }
                break;
            case "C":
                if (temp >= 12 && temp <= 15) {
                    System.out.println("O material pode ser transportado.");
                } else {
                    System.out.println("O material não pode ser transportado");
                }
                break;
            case "D":
                if (temp >= 13 && temp <= 14) {
                    System.out.println("O material pode ser transportado.");
                } else {
                    System.out.println("O material não pode ser transportado.");
                }
                break;
            default:
                System.out.println("O tipo do material é inválido.");
        }
    }

}
