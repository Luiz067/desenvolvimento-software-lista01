public class Ex11 {
    public static void executar(){
        double num1 = Prompt.lerDecimal("Digite o primeiro numero:");
        double num2 = Prompt.lerDecimal("Digite o segundo numero:");
        double num3 = Prompt.lerDecimal("Digite o terceiro numero:");

        if (num1 <= num2 && num1 <= num3) {
            Prompt.imprimir(num1 + ", ");
            if (num2 <= num3) {
                Prompt.imprimir(num2 + ", ");
                Prompt.imprimir(num3);
            } else{
                Prompt.imprimir(num3 + ", ");
                Prompt.imprimir(num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            Prompt.imprimir(num2 + ", ");
            if (num1 <= num3) {
                Prompt.imprimir(num1 + ", ");
                Prompt.imprimir(num3);
            } else{
                Prompt.imprimir(num3 + ", ");
                Prompt.imprimir(num1);
            }
        } else if (num3 <= num1 && num3 <= num2) {
            Prompt.imprimir(num3 + ", ");
            if (num1 <= num2) {
                Prompt.imprimir(num1 + ", ");
                Prompt.imprimir(num2);
            } else{
                Prompt.imprimir(num2 + ", ");
                Prompt.imprimir(num1);
            }
        }
    }
}
