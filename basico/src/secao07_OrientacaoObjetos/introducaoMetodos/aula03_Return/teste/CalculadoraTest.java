package secao07_OrientacaoObjetos.introducaoMetodos.aula03_Return.teste;

import secao07_OrientacaoObjetos.introducaoMetodos.aula03_Return.dominio.Calculadora;

/**
 * Classe de teste responsável por demonstrar o uso de métodos
 * que retornam valores.
 *
 * <p>Neste exemplo, um objeto da classe {@link Calculadora} é criado
 * e seus métodos são chamados passando valores como parâmetros.</p>
 *
 * <p>Os métodos retornam o resultado das operações matemáticas,
 * que são armazenados em variáveis e posteriormente exibidos
 * no console.</p>
 */
public class CalculadoraTest {

    public static void main(String[] args) {

        // Criação de um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora();

        // Chamando métodos e armazenando os resultados retornados
        int resultadoSoma = calculadora.somar(10, 50);
        System.out.println("O Resultado da SOMA é: " + resultadoSoma);

        int resultadoSubtracao = calculadora.subtrair(10, 30);
        System.out.println("O Resultado da SUBTRAÇÃO é: " + resultadoSubtracao);
    }
}