package secao03_Operadores.atribuicao;

/**
 * <h2>Operadores de Atribuição em Java</h2>
 *
 * <p>
 * Operadores de atribuição são utilizados para definir ou atualizar o valor
 * de uma variável. O operador de atribuição mais comum é o <code>=</code>,
 * que atribui o valor da direita para a variável localizada à esquerda.
 * </p>
 *
 * <p>
 * Além do operador básico, Java possui operadores de atribuição compostos
 * que combinam uma operação aritmética com a atribuição do resultado à
 * própria variável.
 * </p>
 *
 * <p>
 * Os principais operadores de atribuição compostos são:
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
 * Esses operadores são frequentemente utilizados para tornar o código mais
 * conciso e legível, evitando a repetição da mesma variável em uma operação.
 * </p>
 *
 * <p>
 * No método <code>main</code> desta classe são apresentados exemplos simples
 * demonstrando o uso do operador de atribuição padrão e dos operadores
 * compostos.
 * </p>
 */
public class AulaAtribuicao {

    public static void main(String[] args) {

        int numero = 10;

        // Atribuição simples
        numero = 20;

        // Operadores de atribuição compostos
        numero += 5;  // equivalente a: numero = numero + 5
        numero -= 2;  // equivalente a: numero = numero - 2
        numero *= 3;  // equivalente a: numero = numero * 3
        numero /= 2;  // equivalente a: numero = numero / 2
        numero %= 4;  // equivalente a: numero = numero % 4

        System.out.println("Resultado final: " + numero);
    }
}