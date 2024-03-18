public class Ex16 {
    public static void executar(){
        double nota1 = Prompt.lerDecimal("Nota 1: ");
        double nota2 = Prompt.lerDecimal("Nota 2: ");
        double nota3 = Prompt.lerDecimal("Nota 3: ");

        double  mediaFinal = (nota1 + nota2 + nota3) / 3;

        Prompt.imprimir("Média final: " + mediaFinal);
    }
}
