import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maior = 0;
        int posicaoMaior = 1;
        int numero;

        for (int i = 1; i < 100; i++) {
            numero = scan.nextInt();
            if (i == 1) {
                maior = numero;
                posicaoMaior = 1;
            } else if (numero > maior) {
                maior = numero;
                posicaoMaior = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicaoMaior);
    }
}