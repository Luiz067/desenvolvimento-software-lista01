public class Ex17 {
    public static void executar(){
        double nota1 = Prompt.lerDecimal("Nota 1:");
        double peso1 = Prompt.lerDecimal("Peso da Nota 1:");

        double nota2 = Prompt.lerDecimal("Nota 1:");
        double peso2 = Prompt.lerDecimal("Peso da Nota 1:");

        double nota3 = Prompt.lerDecimal("Nota 1:");
        double peso3 = Prompt.lerDecimal("Peso da Nota 1:");

        double mediaFinal = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / peso1 + peso2 + peso3;

        Prompt.imprimir("Média Final: " + mediaFinal);

    }
}
