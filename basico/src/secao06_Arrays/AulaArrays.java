package secao06_Arrays;

/**
 * <h2>Arrays em Java</h2>
 *
 * <p>
 * Um <strong>array</strong> é uma estrutura de dados utilizada para armazenar
 * múltiplos valores do mesmo tipo em uma única variável. Todos os elementos
 * de um array possuem o mesmo tipo e são organizados de forma sequencial
 * na memória.
 * </p>
 *
 * <p>
 * Cada posição do array é identificada por um <strong>índice</strong>,
 * que sempre começa em <code>0</code>. Isso significa que o primeiro
 * elemento está na posição <code>0</code>, o segundo na posição <code>1</code>,
 * e assim sucessivamente.
 * </p>
 *
 * <p>
 * Para declarar um array em Java é necessário informar o tipo dos elementos
 * e a quantidade de posições que ele irá possuir.
 * </p>
 *
 * <p>Exemplo de declaração:</p>
 *
 * <pre>
 * int[] numeros = new int[5];
 * </pre>
 *
 * <p>
 * Após a criação, os valores podem ser atribuídos utilizando o índice
 * correspondente.
 * </p>
 *
 * <pre>
 * numeros[0] = 10;
 * numeros[1] = 20;
 * </pre>
 *
 * <p>
 * Também é possível inicializar um array diretamente com valores:
 * </p>
 *
 * <pre>
 * int[] numeros = {10, 20, 30, 40};
 * </pre>
 *
 * <p>
 * Para percorrer todos os elementos de um array, normalmente utiliza-se
 * estruturas de repetição como <code>for</code> ou <code>for-each</code>.
 * </p>
 *
 * <p>
 * No método <code>main</code> desta classe são apresentados exemplos de
 * criação, inicialização e acesso aos elementos de um array.
 * </p>
 */
public class AulaArrays {

    public static void main(String[] args) {

        // Declaração e criação de um array com tamanho fixo
        int[] numeros = new int[5];

        // Atribuindo valores às posições do array
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Acessando um elemento específico
        System.out.println("Primeiro elemento: " + numeros[0]);

        // Percorrendo o array com for tradicional
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        // Inicialização direta de um array
        String[] nomes = {"Ana", "Carlos", "Maria"};

        // Percorrendo com for-each
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
    }
}