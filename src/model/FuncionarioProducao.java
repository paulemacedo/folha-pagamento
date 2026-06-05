package model;

public class FuncionarioProducao extends Funcionario {

    private int quantidadePecas;
    private double valorPeca;

    public FuncionarioProducao(
            String nome,
            int matricula,
            int quantidadePecas,
            double valorPeca) {

        super(nome, matricula);
        this.quantidadePecas = quantidadePecas;
        this.valorPeca = valorPeca;
    }

    @Override
    public double calcularExtras() {
        return quantidadePecas * valorPeca;
    }
}