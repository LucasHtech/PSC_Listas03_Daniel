package teste;
import java.util.Scanner;
public class Lista_03_Atv04 {
    public static void main(String[] args){
        Scanner Ler = new Scanner(System.in);
        double pi = 3.141592;
        System.out.println("< - Digite o codigo da Operação - > \n|| [ 1 ] Perimetos - [ 2 ] Area - [ 3 ] Volume ||");
        byte opcao = Ler.nextByte();
        
        System.out.println("| - > Digite o Raio do Circulo / Esfera: ");
        double raio = Ler.nextDouble();
        
        switch(opcao){ 
            case 1: double perimetro = 2*pi*raio;
                System.out.println("| -- [ Perimetro do Circulo: " + perimetro + " ] -- |");
                break;
            case 2: double area = pi* Math.pow(raio, 2);
                System.out.println("| -- [ Area do Circulo: " + area + " ] -- |");
                break;
            case 3: double volume = (4.0/3.0) * pi * Math.pow(raio, 3);
                System.out.println("| -- [ Volume da Esfera: " + volume + " ] -- |");
                break;
        }   
    }
}
