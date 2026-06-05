package model;

public abstract class Funcionario {

    protected String nome;
    protected int matricula;
    protected final double SALARIO_FIXO = 1500.0;

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public abstract double calcularExtras();

    public double calcularSalarioFinal() {
        return SALARIO_FIXO + calcularExtras();
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalarioFixo() {
        return SALARIO_FIXO;
    }
}