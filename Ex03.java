public class Ex03 {
    public static void executar() {
        int a = Prompt.lerInteiro("Digite um numero inteiro: ");
        int b = Prompt.lerInteiro("Digite mais um numero inteiro: ");

        if (a > b) {
            Prompt.imprimir("O primeiro numero digitado é maior que o segundo");
        } else if (a < b) {
            Prompt.imprimir("O segundo numero digitado é maior que o primeiro");
        } else{
            Prompt.imprimir("Numeros informados invalidos");
        }
    }
}
