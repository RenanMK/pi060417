package pi060417;

import java.util.Scanner;

public class diaDosMeses {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Mês: ");

        int mes = leitor.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("O mês %d tem 31 dias \n", mes);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("O mês %d tem 30 dias \n", mes);
                break;
            case 2:
                System.out.println("O mês 2 tem 28 dias");
                break;
            default:
                System.out.println("Digite um mês válido.");
        }
    }
}
