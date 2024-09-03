package Calculadora;

public class FabricaAdministrador implements Fabrica{
    @Override
    public Salario calculaSalario() {
        return new SalarioAdministrador();
    }
}
