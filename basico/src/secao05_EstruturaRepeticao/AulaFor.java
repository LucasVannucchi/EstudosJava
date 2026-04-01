package secao05_EstruturaRepeticao;

/**
 * <h2>Estrutura de Repetição for em Java</h2>
 *
 * <p>
 * A estrutura de repetição <code>for</code> é utilizada quando sabemos
 * previamente quantas vezes um bloco de código deverá ser executado.
 * Ela é amplamente utilizada para percorrer intervalos numéricos,
 * arrays e coleções.
 * </p>
 *
 * <p>
 * O <code>for</code> possui três partes principais:
 * </p>
 *
 * <ul>
 *   <li><strong>Inicialização</strong> – executada apenas uma vez no início do laço</li>
 *   <li><strong>Condição</strong> – avaliada antes de cada iteração</li>
 *   <li><strong>Atualização</strong> – executada ao final de cada iteração</li>
 * </ul>
 *
 * <p>
 * Estrutura básica:
 * </p>
 *
 * <pre>
 * for (inicializacao; condicao; atualizacao) {
 *     // código executado enquanto a condição for verdadeira
 * }
 * </pre>
 *
 * <p>
 * Essa estrutura é considerada mais compacta e legível do que o
 * <code>while</code> quando todas as partes do controle do laço podem
 * ser definidas em uma única linha.
 * </p>
 *
 * <p>
 * No método <code>main</code> desta classe são apresentados exemplos
 * demonstrando diferentes formas de utilização do laço <code>for</code>.
 * </p>
 */
public class AulaFor {

    public static void main(String[] args) {

        // Exemplo 1: Contagem crescente de 1 até 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        // Exemplo 2: Contagem decrescente
        for (int i = 5; i >= 1; i--) {
            System.out.println("Contagem regressiva: " + i);
        }

        // Exemplo 3: Incremento de 2 em 2
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Número par: " + i);
        }

        // Exemplo 4: Uso de múltiplas variáveis no for
        for (int i = 1, j = 10; i <= 5; i++, j--) {
            System.out.println("i: " + i + " | j: " + j);
        }
    }
}