public class Ex19 {
    public static void executar(){
        double altura = Prompt.lerDecimal("Altura do circulo:");
        double raio = Prompt.lerDecimal("Raio do circulo:");

        double volume = 3.14 * (raio * raio) * altura;

        Prompt.imprimir("Volume: " + volume);
    }
}
