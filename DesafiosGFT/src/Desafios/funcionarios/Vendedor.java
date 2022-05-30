package Desafios.funcionarios;

public class Vendedor extends Funcionario {
    private  double comissao;
    private long numeroRevendas;

    public Vendedor(String nome, long cpf, double comissao, long numeroRevendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numeroRevendas = numeroRevendas;
    }

    @Override
    public double calcularSalario() {
        return super.SALARIO_MINIMO + this.comissao + this.numeroRevendas;
    }

}
