package secao04_EstruturasCondicionais;

/**
 * <h2>Estrutura Condicional if / else em Java</h2>
 *
 * <p>
 * A estrutura condicional <code>if</code> é utilizada para executar um bloco
 * de código somente quando uma determinada condição for verdadeira.
 * Essa condição deve resultar em um valor do tipo <code>boolean</code>
 * (<code>true</code> ou <code>false</code>).
 * </p>
 *
 * <p>
 * Caso a condição seja verdadeira, o bloco dentro do <code>if</code> será executado.
 * Caso seja falsa, o programa pode seguir por um bloco alternativo utilizando
 * <code>else</code>.
 * </p>
 *
 * <p>
 * Também é possível encadear múltiplas verificações utilizando
 * <code>else if</code>, permitindo avaliar diferentes condições
 * de forma sequencial.
 * </p>
 *
 * <p>
 * Estrutura básica:
 * </p>
 *
 * <pre>
 * if (condicao) {
 *     // executado se a condição for verdadeira
 * } else if (outraCondicao) {
 *     // executado se a outra condição for verdadeira
 * } else {
 *     // executado se nenhuma condição anterior for verdadeira
 * }
 * </pre>
 *
 * <p>
 * No método <code>main</code> desta classe são apresentados exemplos simples
 * demonstrando o uso das estruturas <code>if</code>, <code>else if</code>
 * e <code>else</code>.
 * </p>
 */
public class AulaIfElse {

    public static void main(String[] args) {

        int idade = 18;

        // Exemplo simples de if
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        }

        // Exemplo com if / else
        int numero = 10;

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // Exemplo com if / else if / else
        int nota = 75;

        if (nota >= 90) {
            System.out.println("Conceito A");
        } else if (nota >= 70) {
            System.out.println("Conceito B");
        } else if (nota >= 60) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Reprovado");
        }
    }
}