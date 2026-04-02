package secao07_OrientacaoObjetos.introducaoMetodos.aula02_Parametros.teste;

import secao07_OrientacaoObjetos.introducaoMetodos.aula02_Parametros.dominio.Calculadora;

/**
 * Classe de teste responsável por demonstrar a utilização de
 * métodos que recebem parâmetros.
 *
 * <p>Neste exemplo, um objeto da classe {@link Calculadora} é criado
 * e seus métodos são chamados passando valores como argumentos.</p>
 *
 * <p>Os valores informados na chamada do método são utilizados
 * como parâmetros para realizar as operações matemáticas
 * definidas na classe de domínio.</p>
 */
public class CalculadoraTest {

    public static void main(String[] args) {

        // Criação de um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora();

        // Chamando métodos e passando valores como parâmetros
        calculadora.somar(10, 50);

        calculadora.subtrair(10, 30);
    }
}