package Calculadora;

public class FabricaProfessor implements Fabrica{
    @Override
    public Salario calculaSalario() {

        return new SalarioProfessor();
    }
}
