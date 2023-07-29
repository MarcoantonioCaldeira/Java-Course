
import java.util.Random;
import java.util.Scanner;
public class MegaSena {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //A biblioteca Scanner pega tudo o que voce digita na tela e exibe

        System.out.println("Olá, digite o seu nome: ");

        String name = scanner.nextLine();

        System.out.println("Olá " + name);

    }
}