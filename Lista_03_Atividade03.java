package teste;
import java.util.Scanner;
public class Lista_03_Atividade03 {
    public static void main(String[] args){    
    Scanner Ler = new Scanner(System.in);
        int A, B, C;
        System.out.print("-> Digite o coeficiente [ A ]");
        A = Ler.nextInt();
        System.out.print("-> Digite o coeficiente [ B ]");
        B = Ler.nextInt();
        System.out.print("-> Digite o coeficiente [ C ]");
        C = Ler.nextInt();
        
        double delta = (B * B) - (4 * A * C);

        if(A == 0 && B == 0 && C != 0){
            System.out.println("Coeficientes informados incorretamente");
        } else if (A == 0 && B != 0){
        double X = -((double)-C / B);
            System.out.println("Essa e uma equação de Primeiro Grau \n - > Raiz Real: " + X);
            
        } else {
        double x1 = (-B + Math.sqrt(delta)) / (2 * A);
        double x2 = (-B - Math.sqrt(delta)) / (2 * A);

          System.out.println("Esta equação possui duas raízes reais diferentes.");
          System.out.println("Raiz 1: x1 = " + x1);
          System.out.println("Raiz 2: x2 = " + x2);
        
        }
    }}

