public class Ex04 {
    public static void imprimir(String texto) {
        Prompt.imprimir(texto);
      }
    public static void executar(){
        double num1 = Prompt.lerDecimal("Digite o primeiro numero");
        double num2 = Prompt.lerDecimal("Digite o segundo numero");

        imprimir("numero 1 + numero 2 = " + Calculadora.somar(num1 ,num2));
        imprimir("numero 1 - numero 2 = " + Calculadora.subtrair(num1 ,num2));
        imprimir("numero 1 * numero 2 = " + Calculadora.multiplicar(num1 ,num2));
        imprimir("numero 1 / numero 2 = " + Calculadora.dividir(num1 ,num2));
    }
}
