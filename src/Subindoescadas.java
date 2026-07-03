import java.util.Scanner;

public class Subindoescadas {

    public static int subirEscada(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        return subirEscada(n - 1) + subirEscada(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de degraus: ");
        int n = scanner.nextInt();

        System.out.println("Número de maneiras de subir: " + subirEscada(n));

        scanner.close();
    }
}