public class Ex08 {
    public static void executar(){
        double numero = Prompt.lerDecimal("Digite um numero: ");

        if (numero >= 50) {
            Prompt.imprimir("Seu numero é maior ou igual a 50");
        } else{
            Prompt.imprimir("Seu numero não é maior ou igual a 50");
        }
    }
}
