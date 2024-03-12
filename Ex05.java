public class Ex05 {
    public static void executar(){
        double a = Prompt.lerDecimal("Numero 1: ");
        double b = Prompt.lerDecimal("Numero 2: ");

        double temp = a;
        a = b;
        b = temp;

        Prompt.imprimir("Valor original do numero 1: " + temp);
        Prompt.imprimir("Valor trocado do numero 1: " + a);

        Prompt.imprimir("Valor original do numero 2: " + a);
        Prompt.imprimir("Valor trocado do numero 2: " + b);
    }
}
