package Calculadora;

public class FabricaCoodernador implements Fabrica{
    @Override
    public Salario calculaSalario() {

        return new SalarioCoodernador();
    }
}
