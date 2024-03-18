public class Ex15 {
    public static void executar(){
        double p1x1 = Prompt.lerDecimal("Digite o valor de P1(x1): ");
        double p1y1 = Prompt.lerDecimal("Digite o valor de P1("+ p1x1 + "; y2): ");
        double p2x2 = Prompt.lerDecimal("Digite o valor de P1(x2): ");
        double p2y2 = Prompt.lerDecimal("Digite o valor de P1("+ p2x2 + "; y2): ");

        double distancia = Math.sqrt((Math.pow(p2x2 - p1x1, 2) + Math.pow(p2y2 - p1y1, 2)));

        Prompt.imprimir("A distância entre os pontos P1 e P2 é: " + distancia);

    }
}
