public class Ex10 {
    public static void executar() {
        int a = Prompt.lerInteiro("Digite uma valor de 1 a 5: "); 
        if (a == 1) {
            Prompt.imprimir("Um");
        } else if (a == 2) {
            Prompt.imprimir("Dois");  
        } else if (a == 3) {
            Prompt.imprimir("Três");
        } else if (a == 4) {
            Prompt.imprimir("Quatro");
        } else if (a == 5) {
            Prompt.imprimir("Cinco");
        } else{
            Prompt.imprimir("Numero invalido");
        };
    }
}