package teste;
import java.util.Scanner;
public class Lista_03_Atv05 {
   public static void main(String[] args){
       Scanner Ler = new Scanner(System.in);
       double [] NReal = new double[2];
       double calc = 0;
       System.out.print(" --- { Calculadora } --- \n -> Digite Numero: ");
       NReal[0] = Ler.nextDouble();
       System.out.print(" --- { Calculadora } --- Numero: " + NReal[0] );
       System.out.println("\n< Operador:  1. { + } - 2. { - } - 3. { * } - 4. { / } - 5. { ^ } ");
       byte opcao = Ler.nextByte();
       switch(opcao){
           case 1: 
               System.out.println(" --- { Calculadora } --- Numero: " + NReal[0] + " + " + "<Digite outro Numero>" );
               NReal[1] = Ler.nextDouble();
               calc = NReal[1] + NReal[0]; 
               /*--- Resultado -------------------------------------------------*/
               System.out.println(" --- { Calculadora } --- \n-> Resultado:" 
                       + NReal[0] + " + " + NReal[1] + " = " + calc);
               break;
           case 2:
               System.out.println(" --- { Calculadora } --- \n->Numero: " + NReal[0] + " - " + "<Digite outro Numero>" );
               NReal[1] = Ler.nextDouble();
               calc = NReal[1] - NReal[0];
               /*--- Resultado ------------------------------------------------*/
                System.out.println(" --- { Calculadora } --- \n-> Resultado:" 
                       + NReal[0] + " - " + NReal[1] + " = " + calc);
               break;
           case 3:
               System.out.println(" --- { Calculadora } --- \n->Numero: " + NReal[0] + " * " + "<Digite outro Numero>" );
               NReal[1] = Ler.nextDouble();
               calc = NReal[1] * NReal[0];      
               /*--- Resultado -------------------------------------------------*/
                System.out.println(" --- { Calculadora } --- \n-> Resultado:" 
                       + NReal[0] + " * " + NReal[1] + " = " + calc);
               break;
           case 4:
               System.out.println(" --- { Calculadora } --- \n->Numero: " + NReal[0] + " / " + "<Digite outro Numero>" );
               NReal[1] = Ler.nextDouble();
               calc = NReal[1] / NReal[0];
               /*--- Resultado -----------------------------------------------*/
               System.out.println(" --- { Calculadora } --- \n-> Resultado:" 
                       + NReal[0] + " / " + NReal[1] + " = " + calc);
               break;
               
           case 5: 
               System.out.println(" --- { Calculadora } --- \n->Numero: " + NReal[0] + " ^ " + "<Digite outro Numero>" );
               NReal[1] = Ler.nextDouble();
               calc = Math.pow(NReal[0], NReal[1]);
               /*--- Resultado */
               System.out.println(" --- { Calculadora } --- \n-> Resultado:" 
                       + NReal[0] + " + " + NReal[1] + " = " + calc);
               break;
                default:
               System.out.println("Erro: Operação inválida!");
               return;
       }

      

   }  
}
