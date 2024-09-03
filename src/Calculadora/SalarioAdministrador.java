package Calculadora;

public class SalarioAdministrador implements Salario {


    @Override
    public Double salario(Double salario, String escolaridade, Integer horas) {
        return salario;
    }

    @Override
    public double calculaEscolaridade(String escolaridade) {
        return 0;
    }
}
