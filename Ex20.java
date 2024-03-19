public class Ex20 {
    public static void executar(){
        double tempo = Prompt.lerDecimal("Quantas horas durou a sua viagem?");
        double velocidade = Prompt.lerDecimal("Qual a velocidade média da viagagem?");

        double litros =  (tempo / velocidade) * 12;

        Prompt.imprimir("Gastou " + litros + " litros");
    }
}
