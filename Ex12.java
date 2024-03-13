public class Ex12 {
    public static void executar(){
        int mes = Prompt.lerInteiro("Escreva um mes do ano:");

        if (mes == 1) {
            Prompt.imprimir("Janeiro");
        } else if (mes == 2) {
            Prompt.imprimir("Fevereiro");
        } else if (mes == 3){
            Prompt.imprimir("Março");
        } else if (mes == 4) {
            Prompt.imprimir("Abril");
        } else if (mes == 5) {
            Prompt.imprimir("Maio");
        } else if (mes == 6){
            Prompt.imprimir("Junho");
        } else if (mes == 7) {
            Prompt.imprimir("Julho");
        } else if (mes == 8) {
            Prompt.imprimir("Agosto");
        } else if (mes == 9){
            Prompt.imprimir("Setembro");
        } else if (mes == 10) {
            Prompt.imprimir("Outubro");
        } else if (mes == 11){
            Prompt.imprimir("Novembro");
        } else if (mes == 12) {
            Prompt.imprimir("Dezembro");
        } else {
            Prompt.imprimir("Mês invalido");
        }
    }
}
