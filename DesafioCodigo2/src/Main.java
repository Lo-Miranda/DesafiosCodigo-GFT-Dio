import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] inputSplit = input.split(" ");
        int H = (Integer.valueOf(inputSplit[0]));
        int P = (Integer.valueOf(inputSplit[1]));

//TODO: Complete os espaços em branco com uma possível solução para o desafio
        double media = Double.parseDouble(String.valueOf(H))/Double.parseDouble(String.valueOf(P));

        System.out.printf("%.2f", media);
    }
}
