package secao03_Operadores.atribuicao;

/**
 * <h2>Operadores de Atribuição e Incremento em Java</h2>
 *
 * <p>
 * Operadores de atribuição são utilizados para definir ou atualizar o valor
 * de uma variável. O operador mais comum é o <code>=</code>, que atribui
 * à variável da esquerda o valor da expressão à direita.
 * </p>
 *
 * <p>
 * Java também possui operadores de atribuição compostos, que combinam
 * uma operação aritmética com a atribuição do resultado à própria variável.
 * </p>
 *
 * <ul>
 *   <li><strong>+=</strong> soma e atribui</li>
 *   <li><strong>-=</strong> subtrai e atribui</li>
 *   <li><strong>*=</strong> multiplica e atribui</li>
 *   <li><strong>/=</strong> divide e atribui</li>
 *   <li><strong>%=</strong> calcula o resto da divisão e atribui</li>
 * </ul>
 *
 * <p>
 * Além disso, Java possui os operadores de <strong>incremento</strong> (<code>++</code>)
 * e <strong>decremento</strong> (<code>--</code>), que aumentam ou diminuem o valor
 * de uma variável em uma unidade.
 * </p>
 *
 * <p>
 * Esses operadores podem ser utilizados em duas formas:
 * </p>
 *
 * <ul>
 *   <li><strong>Pós-incremento:</strong> <code>contador++</code> (usa o valor atual e depois incrementa)</li>
 *   <li><strong>Pré-incremento:</strong> <code>++contador</code> (incrementa primeiro e depois usa o valor)</li>
 * </ul>
 *
 * <p>
 * O método <code>main</code> demonstra exemplos práticos de cada um desses operadores.
 * </p>
 */
public class AulaAtribuicao {

    public static void main(String[] args) {

        int numero = 10;

        // Atribuição simples
        numero = 20;

        // Operadores de atribuição compostos
        numero += 5;  // numero = numero + 5
        numero -= 2;  // numero = numero - 2
        numero *= 3;  // numero = numero * 3
        numero /= 2;  // numero = numero / 2
        numero %= 4;  // numero = numero % 4

        System.out.println("Resultado após atribuições: " + numero);

        int contador = 1;

        // Pós-incremento: usa o valor atual e depois incrementa
        System.out.println("Pós-incremento: " + contador++);
        System.out.println("Valor após pós-incremento: " + contador);

        // Pré-incremento: incrementa primeiro e depois usa o valor
        System.out.println("Pré-incremento: " + ++contador);

        // Pós-decremento
        System.out.println("Pós-decremento: " + contador--);
        System.out.println("Valor após pós-decremento: " + contador);

        // Pré-decremento
        System.out.println("Pré-decremento: " + --contador);

        int contador2 = 0;

        System.out.println(contador2++); // imprime 0, depois contador2 vira 1
        System.out.println(contador2);   // imprime 1
        System.out.println(++contador2); // primeiro vira 2, depois imprime 2
        System.out.println(contador2);   // imprime 2
    }
}