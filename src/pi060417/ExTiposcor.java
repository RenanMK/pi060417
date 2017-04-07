package pi060417;

import java.util.Scanner;

public class ExTiposcor {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //ENTRADAS
        System.out.print("Tipo: ");
        String tipo = leitor.next();
        tipo = tipo.toUpperCase();
        System.out.print("Temperatura: ");
        double temp = leitor.nextDouble();
        boolean podeTransportar = false;
        //PROCESSAMENTO
        switch(tipo){
            case "A":podeTransportar = temp >= 10 && temp <= 17;
            break;
            case "B": podeTransportar = temp < 11 || temp > 16;
            break;
            case "C": podeTransportar = temp >= 12 && temp <= 15;
            break;
            case "D": podeTransportar = temp >= 13 && temp <= 14;
            break;
        }
        if(podeTransportar){
            System.out.println("Pode Transportar.");
        }else{
            System.out.println("Não pode transportar.");
        }
    }
    

}
