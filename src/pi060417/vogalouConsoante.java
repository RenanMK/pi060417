package pi060417;

import java.util.Scanner;

public class vogalouConsoante {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Letra: ");
        String letra = leitor.next();
        letra = letra.toLowerCase();
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vogal.");
                break;
            default:
                System.out.println("Consoante.");
        }
    }
}
