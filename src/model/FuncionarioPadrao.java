package model;

public class FuncionarioPadrao extends Funcionario {

    public FuncionarioPadrao(String nome, int matricula) {
        super(nome, matricula);
    }

    @Override
    public double calcularExtras() {
        return 0;
    }
}