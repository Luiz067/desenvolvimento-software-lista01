public class Ex01 {
    public static void executar() {
        double num1 = Prompt.lerDecimal("Digite um numero: ");
        if (num1 > 10) {
            Prompt.imprimir("Numero maior que 10!");
        } else {
            Prompt.imprimir("Numero menor ou igual a 10!");
        }
    }
}
