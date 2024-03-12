public class Ex09 {
    public static void executar(){
        double a = Prompt.lerDecimal("Numero A: ");
        double b = Prompt.lerDecimal("Numero B: ");

        if (a > b) {
            Prompt.imprimir("Os numeros são diferentes");
            Prompt.imprimir("O maior numero é o A");
        } else if (a < b) {
            Prompt.imprimir("Os numeros são diferentes");
            Prompt.imprimir("O maior numero é o B");
        } else{
            Prompt.imprimir("Seus numeros são iguais!");
        }
    }
}
