package secao07_OrientacaoObjetos.introducaoMetodos.aula01.teste;

import secao07_OrientacaoObjetos.introducaoMetodos.aula01.dominio.Calculadora;

/**
 * Classe de teste responsável por demonstrar a chamada de métodos
 * definidos em outra classe.
 *
 * <p>Neste exemplo, é criado um objeto da classe {@link Calculadora}
 * e o método {@code somar()} é invocado para executar a operação
 * definida na classe de domínio.</p>
 *
 * <p>Este padrão de separação entre classes de domínio e classes
 * de teste é comum em projetos Java, permitindo organizar melhor
 * as responsabilidades do código.</p>
 */
public class CalculadoraTest {

    public static void main(String[] args) {

        // Criação de um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora();

        // Chamada do método somar
        calculadora.somar();

        calculadora.subtrair();
    }
}