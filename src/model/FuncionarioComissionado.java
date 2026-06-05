package model;

public class FuncionarioComissionado extends Funcionario {

    private double vendas;
    private double percentualComissao;

    public FuncionarioComissionado(
            String nome,
            int matricula,
            double vendas,
            double percentualComissao) {

        super(nome, matricula);
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularExtras() {
        return vendas * (percentualComissao / 100);
    }
}