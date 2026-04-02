package secao07_OrientacaoObjetos.introducaoMetodos.aula01.dominio;

/**
 * Classe responsável por demonstrar a criação e utilização de
 * <strong>métodos</strong> em Java.
 *
 * <p>Um método representa um comportamento ou ação que um objeto
 * pode executar. Ele é definido dentro de uma classe e pode ser
 * chamado a partir de um objeto dessa classe.</p>
 *
 * <p>Neste exemplo, a classe {@code Calculadora} possui um método
 * simples chamado {@code somar()}, que realiza uma operação de
 * adição e imprime o resultado no console.</p>
 *
 * <p>Este exemplo tem como objetivo apresentar a estrutura básica
 * de um método e como ele pode ser invocado por outra classe.</p>
 */
public class Calculadora {

    /**
     * Realiza uma soma simples entre dois valores inteiros
     * e exibe o resultado no console.
     */
    public void somar() {
        System.out.println("O VALOR DA SOMA É: " + (10 + 10));
    }

    public void subtrair() {
        System.out.println("O VALOR DA SUBTRAÇÃO É: " + (10 - 5));
    }
}