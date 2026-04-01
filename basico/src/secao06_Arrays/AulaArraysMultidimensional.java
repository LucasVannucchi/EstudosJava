package secao06_Arrays;

/**
 * <h2>Arrays Multidimensionais em Java</h2>
 *
 * <p>
 * Um <strong>array multidimensional</strong> é um array que contém outros arrays
 * como seus elementos. O tipo mais comum é o array bidimensional, que pode ser
 * visualizado como uma <strong>tabela composta por linhas e colunas</strong>.
 * </p>
 *
 * <p>
 * Cada elemento é acessado utilizando dois índices:
 * </p>
 *
 * <ul>
 *   <li>O primeiro índice representa a <strong>linha</strong></li>
 *   <li>O segundo índice representa a <strong>coluna</strong></li>
 * </ul>
 *
 * <p>
 * Exemplo de declaração de um array bidimensional:
 * </p>
 *
 * <pre>
 * int[][] matriz = new int[3][3];
 * </pre>
 *
 * <p>
 * Nesse exemplo, o array possui 3 linhas e 3 colunas. Cada posição pode
 * ser acessada informando os dois índices correspondentes.
 * </p>
 *
 * <pre>
 * matriz[0][0] = 10;
 * matriz[1][2] = 30;
 * </pre>
 *
 * <p>
 * Para percorrer todos os elementos de um array multidimensional,
 * normalmente utilizam-se <strong>estruturas de repetição aninhadas</strong>,
 * como dois loops <code>for</code>.
 * </p>
 *
 * <p>
 * No método <code>main</code> desta classe são apresentados exemplos de
 * criação, inicialização e iteração em arrays multidimensionais.
 * </p>
 */
public class AulaArraysMultidimensional {

    public static void main(String[] args) {

        // Declaração de um array bidimensional (3 linhas e 3 colunas)
        int[][] matriz = new int[3][3];

        // Atribuindo valores à matriz
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        // Acessando um elemento específico
        System.out.println("Elemento na posição [1][2]: " + matriz[1][2]);

        // Percorrendo a matriz com loops aninhados
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        // Inicialização direta de uma matriz
        int[][] outraMatriz = {
                {10, 20, 30},
                {40, 50, 60}
        };

        // Percorrendo com for-each
        for (int[] linha : outraMatriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}