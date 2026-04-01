package secao05_EstruturaRepeticao;

/**
 * <h2>Uso da instrução continue em estruturas de repetição</h2>
 *
 * <p>
 * A instrução <code>continue</code> é utilizada dentro de laços de repetição
 * (<code>for</code>, <code>while</code> ou <code>do-while</code>) para
 * interromper a execução da iteração atual e passar imediatamente
 * para a próxima iteração do laço.
 * </p>
 *
 * <p>
 * Diferentemente do <code>break</code>, que encerra completamente o laço,
 * o <code>continue</code> apenas ignora o restante do código dentro da
 * iteração corrente e faz com que a próxima verificação da condição
 * seja realizada.
 * </p>
 *
 * <p>
 * Essa instrução é útil quando desejamos pular certos valores ou casos
 * específicos sem interromper toda a repetição.
 * </p>
 *
 * <p>
 * Estrutura básica dentro de um laço:
 * </p>
 *
 * <pre>
 * for (...) {
 *     if (condicao) {
 *         continue;
 *     }
 *
 *     // código executado apenas quando a condição não for atendida
 * }
 * </pre>
 *
 * <p>
 * No método <code>main</code> desta classe são apresentados exemplos
 * demonstrando como o <code>continue</code> pode ser utilizado para
 * ignorar determinadas iterações de um laço.
 * </p>
 */
public class AulaContinue {

    public static void main(String[] args) {

        // Exemplo 1: Ignorando números pares em um for
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                continue;
            }

            System.out.println("Número ímpar: " + i);
        }

        // Exemplo 2: Uso do continue em um while
        int contador = 0;

        while (contador < 5) {
            contador++;

            if (contador == 3) {
                System.out.println("Pulando o valor 3.");
                continue;
            }

            System.out.println("Contador: " + contador);
        }
    }
}