package teste;
import java.util.Scanner;
public class Lista_03_Atividade02 {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
        
        // Aceita apenas valores inteiros para evitar troco em centavos
        System.out.print("Informe o valor da compra (em reais, sem centavos): R$ ");
        int valorCompra = scanner.nextInt();
        
        System.out.print("Informe o valor pago (em reais, sem centavos): R$ ");
        int valorPago = scanner.nextInt();
        
        if (valorPago < valorCompra) {
            System.out.println("Valor insuficiente! Pagamento negado.");
        } else {
            int troco = valorPago - valorCompra;
            System.out.println("Troco a ser devolvido: R$ " + troco);
            calcularTroco(troco);
        }
        

    }
    
    public static void calcularTroco(int troco) {
        int[] notas = {50, 20, 10, 5, 2, 1};
        
        for (int nota : notas) {
            int quantidade = troco / nota;
            if (quantidade > 0) {
                System.out.println("Notas de R$ " + nota + ": " + quantidade);
                troco %= nota; // Atualiza o troco restante
            }
        }
    }
}
