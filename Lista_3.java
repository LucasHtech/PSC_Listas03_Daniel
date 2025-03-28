/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.Scanner;
public class Lista_3 {
    public static void main(String[] args){
        /* ----- VARIAVEIS -----*/
        int [] num = new int[3];
        int numMaior;
        int numMenor;
        double media;
        /* ----- VARIAVEIS -----*/
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite 3 Numeros: ");
        num[0] = ler.nextInt();
        num[1] = ler.nextInt();
        num[2] = ler.nextInt();
        
        media = (num[0]+num[1]+num[2])/3;
        if(num[0] > num[1] && num[0] > num[2]){ 
               numMaior = num[0];} 
        else if(num[1] > num[0] && num[1] > num[2]) {
               numMaior = num[1];} 
        else {
               numMaior = num[2];}
        
        if(num[0] < num[1] && num[0] < num[2]){ 
               numMenor = num[0];} 
        else if(num[1] < num[0] && num[1] < num[2]) {
               numMenor = num[1];} 
        else {
               numMenor = num[2];}

        System.out.println("- 1° N Digitado: " + num[0] + "- 2° N Digitado: " + num[1]+ "- 3° N Digitado: " + num[2]
        + "\nNumero Maior: " + numMaior + " - Numero Menor: " +numMenor + "\nMedia: " +media
        );
               

    }
    
}
