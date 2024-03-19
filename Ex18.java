public class Ex18 {
    public static void executar() {

        double nota1 = Prompt.lerDecimal("Nota 1:");
        double nota2 = Prompt.lerDecimal("Nota 2:");
        double nota3 = Prompt.lerDecimal("Nota 3:");

        double mediaHarmonica = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));

        Prompt.imprimir("A média harmônica é " + mediaHarmonica);
    }
}
