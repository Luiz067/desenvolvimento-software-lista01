public class Ex13 {
    public static void executar() {
        double A = Prompt.lerDecimal("Diga um valor para A:");
        double B = Prompt.lerDecimal("Diga um valor para B:");
        char operacao = Prompt.lerLinha("Qual operação você quer?(+; -; *; /)").charAt(0);
        if (A == 0 || B == 0 && operacao == '/') {
            Prompt.imprimir("A sua conta não pode ser feita");
        } else {
            if (operacao == '+') {
                double resultado = A + B;
                Prompt.imprimir("A + B = " + resultado);
            } else if (operacao == '-') {
                double resultado = A - B;
                Prompt.imprimir("A - B = " + resultado);
            } else if (operacao == '*') {
                double resultado = A * B;
                Prompt.imprimir("A x B = " + resultado);
            } else if (operacao == '/') {
                double resultado = A / B;
                Prompt.imprimir("A / B = " + resultado);
            } else {
                Prompt.imprimir("Operador invalido");
            }
        }

    }
}
