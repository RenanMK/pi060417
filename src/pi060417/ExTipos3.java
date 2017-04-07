
package pi060417;

import java.util.Scanner;


public class ExTipos3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Tipo: ");
        String tipo = leitor.next();
        tipo = tipo.toUpperCase();
        System.out.print("Temperatura: ");
        double temperatura = leitor.nextDouble();
        boolean podeTransportar = tipo.equals("A") && temperatura >= 10 && temperatura <= 17
                               || tipo.equals("B") && temperatura >= 11 && temperatura <= 16
                               || tipo.equals("C") && temperatura >= 12 && temperatura <= 15
                               || tipo.equals("D") && temperatura >= 13 && temperatura <= 16;
        if(podeTransportar){
            System.out.println("Pode transportar");
        }else{
            System.out.println("Não pode transportar.");
        }
    }
    
}
