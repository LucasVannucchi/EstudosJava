package secao05_EstruturaRepeticao;

/**
 * <h2>Uso da instrução break em estruturas de repetição</h2>
 *
 * <p>
 * A instrução <code>break</code> é utilizada para interromper imediatamente
 * a execução de um laço de repetição (<code>for</code>, <code>while</code>
 * ou <code>do-while</code>) ou de uma estrutura <code>switch</code>.
 * </p>
 *
 * <p>
 * Quando o <code>break</code> é executado dentro de um laço, o fluxo do
 * programa sai do bloco de repetição e continua a execução na primeira
 * instrução após o laço.
 * </p>
 *
 * <p>
 * Essa instrução é útil quando desejamos encerrar a repetição antes que
 * a condição do laço se torne falsa, como ao encontrar um valor específico
 * em uma busca ou ao detectar uma condição de erro.
 * </p>
 *
 * <p>
 * Estrutura básica dentro de um laço:
 * </p>
 *
 * <pre>
 * for (...) {
 *     if (condicao) {
 *         break;
 *     }
 * }
 * </pre>
 *
 * <p>
 * No método <code>main</code> desta classe são apresentados exemplos
 * demonstrando como o <code>break</code> pode ser utilizado para interromper
 * laços de repetição de forma controlada.
 * </p>
 */
public class AulaBreak {

    public static void main(String[] args) {

        // Exemplo 1: Interrompendo um for ao encontrar um valor específico
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                System.out.println("Interrompendo o laço ao encontrar o valor " + i);
                break;
            }

            System.out.println("Valor de i: " + i);
        }

        // Exemplo 2: Uso do break em um while
        int contador = 1;

        while (contador <= 10) {

            if (contador == 3) {
                System.out.println("Laço interrompido no valor " + contador);
                break;
            }

            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}