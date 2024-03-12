public class Ex06 {
    public static void executar(){
        double celsius = Prompt.lerDecimal("Quantos graus Celsius está agora?");

        double fahrenheit = (9 * celsius + 160) / 5;

        Prompt.imprimir("A sua temperatura em Fahrenheit é " + fahrenheit + ".");
    }
}
