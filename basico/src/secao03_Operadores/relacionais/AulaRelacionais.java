package secao03_Operadores.relacionais;

/**
 * <h2>Operadores Relacionais em Java</h2>
 *
 * <p>
 * Operadores relacionais são utilizados para comparar dois valores.
 * O resultado de uma expressão relacional é sempre um valor do tipo
 * <code>boolean</code>, ou seja, <code>true</code> ou <code>false</code>.
 * </p>
 *
 * <p>
 * Esses operadores são muito utilizados em estruturas de controle
 * como <code>if</code>, <code>while</code> e <code>for</code>, onde
 * decisões precisam ser tomadas com base em comparações entre valores.
 * </p>
 *
 * <p>
 * Os principais operadores relacionais em Java são:
 * </p>
 *
 * <ul>
 *   <li><strong>&gt;</strong> maior que</li>
 *   <li><strong>&lt;</strong> menor que</li>
 *   <li><strong>&gt;=</strong> maior ou igual a</li>
 *   <li><strong>&lt;=</strong> menor ou igual a</li>
 *   <li><strong>==</strong> igual a</li>
 *   <li><strong>!=</strong> diferente de</li>
 * </ul>
 *
 * <p>
 * Esses operadores podem ser utilizados para comparar valores numéricos,
 * caracteres e, em alguns casos, referências de objetos. No caso de objetos,
 * o operador <code>==</code> compara as referências de memória e não
 * necessariamente o conteúdo do objeto.
 * </p>
 *
 * <p>
 * No método <code>main</code> desta classe serão apresentados exemplos
 * demonstrando como essas comparações funcionam na prática.
 * </p>
 */
public class AulaRelacionais {

    public static void main(String[] args) {

        // % é utilizado para trazer o resto da divisão.
        int num1 = 10 % 2; // Vai retornar 0, pois, 10/2 é = 5 e não sobra nada na divisão
        System.out.println("RESTO DA DIVISÃO = " + num1);

        int num2 = 10 % 3; // Vai retornar 1, pois, 10/3 é = 9 e com isso sobra 1 na divisão
        System.out.println("RESTO DA DIVISÃO = " + num2);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("Dez é maior que vinte? " + isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("Dez é menor que vinte? " + isDezMenorQueVinte);
        boolean isDezMaiorOuIgualQueVinte = 10 >= 20;
        System.out.println("Dez é maior ou igual que vinte? " + isDezMaiorOuIgualQueVinte);
        boolean isDezMenorOuIgualVinte = 10 <= 20;
        System.out.println("Dez é menor ou igual que vinte? " + isDezMenorOuIgualVinte);
        boolean isDezIgualVinte = 10 == 20;
        System.out.println("Dez é igual a vinte? " + isDezIgualVinte);
        boolean isDezIgualDez = 10 == 10;
        System.out.println("Dez é igual a dez? " + isDezIgualDez);
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("Dez é diferente de dez? " + isDezDiferenteDez);
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("Dez é diferente de vinte? " + isDezDiferenteVinte);
    }
}