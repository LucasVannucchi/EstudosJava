package secao03_Operadores.logicos;

/**
 * <h2>Operador Lógico OR (||) em Java</h2>
 *
 * <p>
 * O operador lógico <strong>OR</strong> (<code>||</code>) é utilizado para
 * combinar duas ou mais expressões booleanas. O resultado da operação será
 * <code>true</code> se <strong>pelo menos uma</strong> das expressões avaliadas
 * for verdadeira.
 * </p>
 *
 * <p>
 * Caso todas as condições avaliadas sejam <code>false</code>, o resultado
 * final da expressão será <code>false</code>.
 * </p>
 *
 * <p>
 * Assim como o operador <code>&&</code>, o operador <code>||</code> também
 * utiliza o conceito de <strong>short-circuit</strong>. Isso significa que,
 * se a primeira condição já for avaliada como <code>true</code>, as demais
 * condições não serão avaliadas, pois o resultado final da expressão já
 * foi determinado.
 * </p>
 *
 * <p>
 * Esse operador é muito utilizado em estruturas condicionais como
 * <code>if</code>, <code>while</code> e <code>for</code>, quando é necessário
 * verificar se ao menos uma entre várias condições é satisfeita.
 * </p>
 *
 * <p>
 * No método <code>main</code> desta classe serão apresentados exemplos
 * práticos demonstrando o comportamento do operador lógico OR.
 * </p>
 */
public class AulaOR {

    public static void main(String[] args) {

        //Resultado verdadeiro, pois as duas condições são verdadeiras
        int idade = 21;
        float salario = 2500f;
        boolean isDentroDaLei = idade > 18 && salario >= 2500;
        System.out.println(isDentroDaLei);

        //Resultado verdadeiro, pois uma das duas condições é verdadeiro
        boolean isMaiorDeIdadeDentroDaLei = idade < 18 || salario >= 2500;
        System.out.println(isMaiorDeIdadeDentroDaLei);

        //Resultado falso, pois as duas condições são falsas
        boolean isDentroDaLeiMaiorDeIdadeESalarioMenor = idade < 18 || salario  < 2500;
        System.out.println(isDentroDaLeiMaiorDeIdadeESalarioMenor);
    }
}