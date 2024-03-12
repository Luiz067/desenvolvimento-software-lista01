public class Ex07 {
    public static void executar(){
        double numero = Prompt.lerDecimal("Digite um numero: ");

        if (numero >= 100 && numero <= 200) {
            Prompt.imprimir("Seu numero está entre 100 e 200");
        } else{
            Prompt.imprimir("Seu numero não está entre 100 e 200");
        }
    }
}
