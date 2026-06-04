package folhaPagamento;

public class Funcionario {
	private int registro;
	private String nome;
	private String tipo;
	private double salario;
	
    public Funcionario(int registro, String nome, String tipo, double salario) {
        this.registro = registro;
        this.nome = nome;
        this.tipo = tipo;
        this.salario = salario;
    }

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
    
    

}
