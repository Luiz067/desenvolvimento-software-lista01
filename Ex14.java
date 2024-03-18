public class Ex14 {
    public static void executar() {
        double a = Prompt.lerDecimal("De uma valor para A:");
        double n = Prompt.lerDecimal("De um valor para N:");
        double r = Prompt.lerDecimal("De um valor para R:");

        double an = a * 1 + (n - 1) * r;

        //Prompt.imprimir("an = " + a + "1 + " + "(" + n + " - 1) * " + r);
        Prompt.imprimir("an = " + an);
    }
}
