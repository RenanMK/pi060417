package pi060417;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //ENTRADAS
        System.out.print("N1: ");
        double n1 = leitor.nextDouble();
        System.out.print("N2: ");
        double n2 = leitor.nextDouble();
        System.out.printf("Digite \n 1 para soma. \n 2 para subtração. \n 3 para multiplicação. \n 4 para divisão.\n ");
        String operaçao = leitor.next();
        double resultado = 0;
        //PROCESSAMENTO
        switch (operaçao) {
            case "1":
                resultado = n1 + n2;
                System.out.printf("A soma entre %.2f e %.2f é: %.2f ", n1, n2, resultado);
                break;
            case "2":
                resultado = n1 - n2;
                System.out.printf("A subtração entre %.2f e %.2f é: %.2f ", n1, n2, resultado);
                break;
            case "3":
                resultado = n1 * n2;
                System.out.printf("A multiplicação entre %.2f e %.2f é: %.2f ", n1, n2, resultado);
                break;
            case "4":
                resultado = n1 / n2;
                System.out.printf("A divisão entre %.2f e %.2f é: %.2f ", n1, n2, resultado);
                break;
            default:
                System.out.println("Operação inválida.");
        }
    }
}
