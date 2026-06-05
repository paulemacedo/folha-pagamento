package service;

import java.util.ArrayList;
import model.Funcionario;

public class FolhaPagamento {

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void gerarFolha() {

        System.out.println("\nTotal de pessoas cadastradas: "
                + funcionarios.size());

        for (Funcionario f : funcionarios) {

            System.out.println("\nNome: " + f.getNome());
            System.out.println("Matrícula: " + f.getMatricula());
            System.out.println("Salário Fixo: " + f.getSalarioFixo());
            System.out.println("Extras: " + f.calcularExtras());
            System.out.println("Salário Final: "
                    + f.calcularSalarioFinal());
        }
    }
}