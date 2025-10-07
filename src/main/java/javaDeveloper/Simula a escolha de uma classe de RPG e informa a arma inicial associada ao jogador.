import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rpg {
    public static void main(String[] args) {

        List<String> classes = new ArrayList<>();
        classes.add("Guerreiro");
        classes.add("Mago");
        classes.add("Arqueiro");
        classes.add("Ladino");
        classes.add("Clérigo");

        List<String> armas = new ArrayList<>();
        armas.add("Espada + Escudo.");
        armas.add("Cajado + Chapéu de mago.");
        armas.add("Arco e Flecha + Bota.");
        armas.add("Duas facas envenenadas.");
        armas.add("Grimório.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a sua classe:");
        for (int i = 0; i < classes.size(); i++) {
            System.out.println((i + 1) + ". " + classes.get(i));
        }

        int escolha = 0;
        do {
            System.out.print("Digite o número da sua classe desejada: ");
            escolha = sc.nextInt();
            if (escolha < 1 || escolha > classes.size()) {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        } while (escolha < 1 || escolha > classes.size());

        System.out.println("Você escolheu: " + classes.get(escolha - 1));
        System.out.println("Sua arma inicial será: " + armas.get(escolha - 1));

        sc.close();
    }
}
