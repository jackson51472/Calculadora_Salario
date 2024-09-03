package Calculadora;

public class SalarioCoodernador implements Salario{
    @Override
    public Double salario(Double salario, String escolaridade, Integer horas) {
        return  salario * this.calculaEscolaridade(escolaridade);
    }

    @Override
    public double calculaEscolaridade(String escolaridade) {
        if(escolaridade.equals("doutorado")){
            return 1.3;
        }
        if(escolaridade.equals("mestrado")){
            return 1.2;
        }
        if(escolaridade.equals("graduação")){
            return 1.1;
        }
        return 1;
    }
}

