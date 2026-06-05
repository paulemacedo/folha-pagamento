import java.util.Scanner;
import model.FuncionarioPadrao;
import model.FuncionarioComissionado;
import model.FuncionarioProducao;
import service.FolhaPagamento;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FolhaPagamento folha = new FolhaPagamento();

        int opcao;

        do {

            System.out.println("\n=== FOLHA DE PAGAMENTO ===");
            System.out.println("1 - Cadastrar Funcionário Padrão");
            System.out.println("2 - Cadastrar Funcionário Comissionado");
            System.out.println("3 - Cadastrar Funcionário Produção");
            System.out.println("4 - Gerar Folha de Pagamento");
            System.out.println("0 - Sair");

            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Matrícula: ");
                    int matricula = sc.nextInt();
                    sc.nextLine();

                    folha.adicionarFuncionario(
                        new FuncionarioPadrao(nome, matricula)
                    );

                    break;

                case 2:

                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Matrícula: ");
                    matricula = sc.nextInt();

                    System.out.print("Valor das vendas: ");
                    double vendas = sc.nextDouble();

                    System.out.print("Percentual da comissão: ");
                    double percentual = sc.nextDouble();
                    sc.nextLine();

                    folha.adicionarFuncionario(
                        new FuncionarioComissionado(
                            nome,
                            matricula,
                            vendas,
                            percentual
                        )
                    );

                    break;

                case 3:

                    System.out.print("Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Matrícula: ");
                    matricula = sc.nextInt();

                    System.out.print("Quantidade de peças: ");
                    int quantidade = sc.nextInt();

                    System.out.print("Valor da peça: ");
                    double valorPeca = sc.nextDouble();
                    sc.nextLine();

                    folha.adicionarFuncionario(
                        new FuncionarioProducao(
                            nome,
                            matricula,
                            quantidade,
                            valorPeca
                        )
                    );

                    break;

                case 4:

                    folha.gerarFolha();

                    break;

                case 0:

                    System.out.println("Programa encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}