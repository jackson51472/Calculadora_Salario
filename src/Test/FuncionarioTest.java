package Test;


import Calculadora.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void deveRetornarSalarioAdministrador() {
        Fabrica fabrica = new FabricaAdministrador();
        Funcionario funcionario = new Funcionario(fabrica);
        Assertions.assertEquals(1000., funcionario.getSalario().salario(1000.,"graduação",0));
    }
    @Test
    void deveRetornarSalarioCoordenadorMedio() {
        Fabrica fabrica = new FabricaCoodernador();
        Funcionario funcionario = new Funcionario(fabrica);
        Assertions.assertEquals(1000., funcionario.getSalario().salario(1000.,"medio",0));
    }
    @Test
    void deveRetornarSalarioCoordenadorGraduado() {
        Fabrica fabrica = new FabricaCoodernador();
        Funcionario funcionario = new Funcionario(fabrica);
        Assertions.assertEquals(1100, funcionario.getSalario().salario(1000.,"graduação",0));
    }
    @Test
    void deveRetornarSalarioCoordenadorMestrado() {
        Fabrica fabrica = new FabricaCoodernador();
        Funcionario funcionario = new Funcionario(fabrica);
        Assertions.assertEquals(1200, funcionario.getSalario().salario(1000.,"mestrado",0));
    }
    @Test
    void deveRetornarSalarioCoordenadorDoutorado() {
        Fabrica fabrica = new FabricaCoodernador();
        Funcionario funcionario = new Funcionario(fabrica);
        Assertions.assertEquals(1300, funcionario.getSalario().salario(1000.,"doutorado",0));
    }
    @Test
    void deveRetornarSalarioProfessorMedio() {
        Fabrica fabrica = new FabricaProfessor();
        Funcionario funcionario = new Funcionario(fabrica);
        Assertions.assertEquals(1250, funcionario.getSalario().salario(1000.,"medio",5));
    }
    @Test
    void deveRetornarSalarioProfessorGraduado() {
        Fabrica fabrica = new FabricaProfessor();
        Funcionario funcionario = new Funcionario(fabrica);
        Assertions.assertEquals(1350, funcionario.getSalario().salario(1000.,"graduação",5));
    }
    @Test
    void deveRetornarSalarioProfessorMestrado() {
        Fabrica fabrica = new FabricaProfessor();
        Funcionario funcionario = new Funcionario(fabrica);
        Assertions.assertEquals(1450, funcionario.getSalario().salario(1000.,"mestrado",5));
    }
    @Test
    void deveRetornarSalarioProfessorDoutorado() {
        Fabrica fabrica = new FabricaProfessor();
        Funcionario funcionario = new Funcionario(fabrica);
        Assertions.assertEquals(1550, funcionario.getSalario().salario(1000.,"doutorado",5));
    }
}