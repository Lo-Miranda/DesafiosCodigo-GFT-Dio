package Desafios.funcionarios;

public abstract class Funcionario {
    private String nome;
    private long cpf;
    protected final double SALARIO_MINIMO = 1000;

    public Funcionario(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract double calcularSalario();
}
