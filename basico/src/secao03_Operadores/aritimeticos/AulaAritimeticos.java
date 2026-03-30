package secao03_Operadores.aritimeticos;

/**
 * <h2>Operadores Aritméticos em Java</h2>
 *
 * <p>
 * Operadores aritméticos são utilizados para realizar operações matemáticas
 * básicas entre valores numéricos. Eles podem ser aplicados a tipos primitivos
 * como <code>byte</code>, <code>short</code>, <code>int</code>, <code>long</code>,
 * <code>float</code> e <code>double</code>.
 * </p>
 *
 * <p>
 * Em Java, os principais operadores aritméticos são:
 * </p>
 *
 * <ul>
 *   <li><strong>+</strong> Adição</li>
 *   <li><strong>-</strong> Subtração</li>
 *   <li><strong>*</strong> Multiplicação</li>
 *   <li><strong>/</strong> Divisão</li>
 *   <li><strong>%</strong> Módulo (resto da divisão)</li>
 * </ul>
 *
 * <p>
 * A ordem de precedência segue as regras matemáticas tradicionais:
 * multiplicação, divisão e módulo são avaliados antes de adição e subtração.
 * Parênteses podem ser utilizados para alterar a ordem de execução das operações.
 * </p>
 *
 * <p>
 * No método <code>main</code> desta classe, serão demonstrados exemplos simples
 * de utilização desses operadores em operações matemáticas básicas.
 * </p>
 */
public class AulaAritimeticos {

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 10;
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;
        int restoDivisao = num1 % num2;
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(restoDivisao);
    }
}