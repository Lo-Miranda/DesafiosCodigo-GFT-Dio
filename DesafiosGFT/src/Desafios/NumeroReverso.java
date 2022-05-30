package Desafios;

import java.util.Scanner;

public class NumeroReverso {
    public static void numeroReverso(){

      Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Informe um valor inteiro e positivo. Deve conter quatro dígitos: ");
            int numeroInformado = sc.nextInt();
            String numeroConvertido = String.valueOf(numeroInformado); //converte o int em string pq ints não tem num reversos

                if (numeroInformado >= 1000 && numeroInformado <= 999){
                    StringBuilder stringBuilder = new StringBuilder(numeroConvertido);
                    System.out.println(stringBuilder.reverse());
                    break;
                } else if (numeroConvertido.length() < 4) {
                    System.out.println("O número informado deverá ter quatro dígitos");
            }
        } while (true);
    }
}
