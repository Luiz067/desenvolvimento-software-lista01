public class Ex02 {
    public static void executar(){
        double num1 = Prompt.lerDecimal("Digite o primeiro numero: ");
        double num2 = Prompt.lerDecimal("Digite o segundo numero: ");

        double numTotal = num1 + num2;

        Prompt.imprimir("A soma dos dois numeros é " + numTotal + "." );
    }
}
