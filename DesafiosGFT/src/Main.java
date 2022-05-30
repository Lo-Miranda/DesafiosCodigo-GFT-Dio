import Desafios.Macaco;
import Desafios.NumeroReverso;
import Desafios.funcionarios.Consultor;
import Desafios.funcionarios.Vendedor;

public class Main {
    public static void main(String[] args) {
      //  NumeroReverso.numeroReverso();
        /*Macaco macaco1 = new Macaco();
        Macaco macaco2 = new Macaco();

        macaco1.comer("banana");
        macaco2.comer("laranja");
        macaco1.comer("pera");*/

        Vendedor vendedor = new Vendedor("Sabrina", 113213, 104, 45);
        System.out.println("Salário do vendedor: " + vendedor.calcularSalario());

        Consultor consultor = new Consultor("BLa", 4234234, 80, 12);
        System.out.println("Salário do Consultor: " + consultor.calcularSalario());
    }
}
