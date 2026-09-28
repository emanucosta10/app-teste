/**
 * Autor : Emanuella
 * Programa : Programa de Teste 
 * Data : 24/
 */
class Programa {
    
    // Método  principal do programa 
    public static void main(String[] args) {

        // Declaração de variáveis 
        int num1 = 6;
        int num2 = 8;

        int soma = num1 + num2;
        int subtração = num1 - num2;
        int multiplicacao = num1 * num2; 
        double divisao = (double) num1 / num2 ;
        double resto_divisao = num1 % num2;

        // Exibe uma mensagem  no terminal 
        System.out.println("Soma: " + soma );
        System.out.println("Subtração : " + subtração);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + resto_divisao);
       
    
    }
}