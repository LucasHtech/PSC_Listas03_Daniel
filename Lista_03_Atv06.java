package teste;
import java.util.Random;
import java.util.Scanner;
public class Lista_03_Atv06 {
   public static void main(String[] args){
       Scanner Ler = new Scanner(System.in);
       int [] numero = new int[2];
       System.out.print("Digite o Primeiro Numero: ");
       numero[0] = Ler.nextInt();
       System.out.print("Digite o Segundo Numero: ");
       numero[1] = Ler.nextInt();

       int menor = Math.min(numero[0], numero[1]);
       int maior = Math.max(numero[0], numero[1]);
       
       Random Roleta = new Random();
       int numeroRoll = Roleta.nextInt(maior - menor +1)+ menor;
       
       if(numeroRoll % 2 == 0){
           System.out.println("Numero Sorteado: " + numeroRoll + "[NUMERO-PAR-]");
       } else {
           System.out.println("Numero Sorteado: " + numeroRoll + "[NUMERO-IMPAR-]");
       }
   }
}

