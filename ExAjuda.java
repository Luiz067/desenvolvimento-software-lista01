import java.util.Scanner;

public class ExAjuda {
    public static void executar() {
        // String nome = Prompt.lerlinha("Digite o seu nome: ");
        // String nome = Prompt.lerlinha("Digite o seu nome: ");

        // Prompt.imprimir("Nome: " + nome);
        // Prompt.imprimir("Nota: " + nota);

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o nome: ");
        double nota = leitor.nextDouble();

        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);

        leitor.close();    
    }
}
