package Calculadora;

public class Funcionario {
    private Salario salario;
    private String nome;
    public Funcionario (Fabrica fabrica) {
        this.salario = fabrica.calculaSalario();

    }

    public Salario getSalario() {
        return salario;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
