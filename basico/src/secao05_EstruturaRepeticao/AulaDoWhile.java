package secao05_EstruturaRepeticao;

/**
 * <h2>Estrutura de Repetição do-while em Java</h2>
 *
 * <p>
 * A estrutura de repetição <code>do-while</code> é semelhante ao
 * <code>while</code>, porém com uma diferença fundamental: o bloco de
 * código é executado pelo menos uma vez antes da condição ser avaliada.
 * </p>
 *
 * <p>
 * Isso ocorre porque a verificação da condição acontece apenas ao final
 * da execução do bloco, garantindo pelo menos uma iteração.
 * </p>
 *
 * <p>
 * Estrutura básica:
 * </p>
 *
 * <pre>
 * do {
 *     // código executado ao menos uma vez
 * } while (condicao);
 * </pre>
 *
 * <p>
 * O ponto e vírgula após a condição é obrigatório na sintaxe do
 * <code>do-while</code>, diferentemente do <code>while</code> tradicional.
 * </p>
 *
 * <p>
 * Essa estrutura é útil em cenários onde a execução inicial do bloco é
 * necessária, como em menus interativos, validação de entrada de dados
 * ou repetição até que o usuário forneça um valor válido.
 * </p>
 *
 * <p>
 * No método <code>main</code> desta classe são apresentados exemplos
 * demonstrando o funcionamento do <code>do-while</code> e sua diferença
 * em relação ao <code>while</code>.
 * </p>
 */
public class AulaDoWhile {

    public static void main(String[] args) {

        // Exemplo 1: Contagem simples de 1 até 5
        int contador = 1;

        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 5);

        // Exemplo 2: Demonstração de execução mínima (condição já falsa)
        int numero = 10;

        do {
            System.out.println("Este bloco será executado pelo menos uma vez.");
        } while (numero < 5);
    }
}