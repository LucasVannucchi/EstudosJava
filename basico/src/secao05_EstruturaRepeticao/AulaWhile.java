package secao05_EstruturaRepeticao;

/**
 * <h2>Estrutura de Repetição while em Java</h2>
 *
 * <p>
 * A estrutura de repetição <code>while</code> é utilizada quando desejamos
 * executar um bloco de código repetidamente enquanto uma determinada
 * condição for verdadeira.
 * </p>
 *
 * <p>
 * Antes de cada execução do bloco, a condição é avaliada. Se ela for
 * <code>true</code>, o código é executado. Se for <code>false</code>,
 * o laço é encerrado.
 * </p>
 *
 * <p>
 * Essa estrutura é ideal quando não sabemos previamente quantas vezes
 * o código deverá ser executado, mas sabemos qual condição deve ser
 * satisfeita para continuar a repetição.
 * </p>
 *
 * <p>
 * Estrutura básica:
 * </p>
 *
 * <pre>
 * while (condicao) {
 *     // código executado enquanto a condição for verdadeira
 * }
 * </pre>
 *
 * <p>
 * É importante garantir que a condição do <code>while</code> em algum
 * momento se torne falsa, caso contrário o programa entrará em um
 * <em>loop infinito</em>.
 * </p>
 *
 * <p>
 * No método <code>main</code> desta classe são apresentados exemplos simples
 * demonstrando o uso do laço <code>while</code> para contagem e controle
 * de repetição.
 * </p>
 */
public class AulaWhile {

    public static void main(String[] args) {

        // Exemplo 1: Contagem simples de 1 até 5
        int contador = 1;

        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Exemplo 2: Somando números até atingir um limite
        int soma = 0;
        int numero = 1;

        while (numero <= 5) {
            soma += numero;
            numero++;
        }

        System.out.println("Soma total: " + soma);
    }
}