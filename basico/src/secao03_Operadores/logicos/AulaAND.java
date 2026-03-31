package secao03_Operadores.logicos;

/**
 * <h2>Operador Lógico AND (&&) em Java</h2>
 *
 * <p>
 * O operador lógico <strong>AND</strong> (<code>&&</code>) é utilizado para
 * combinar duas ou mais expressões booleanas. O resultado da operação será
 * <code>true</code> apenas se <strong>todas</strong> as expressões avaliadas
 * também forem verdadeiras.
 * </p>
 *
 * <p>
 * Caso uma das condições seja <code>false</code>, o resultado da expressão
 * completa será <code>false</code>.
 * </p>
 *
 * <p>
 * O operador <code>&&</code> utiliza o conceito de <strong>short-circuit</strong>.
 * Isso significa que, se a primeira condição já for avaliada como
 * <code>false</code>, as demais condições não serão avaliadas, pois o
 * resultado final da expressão já será conhecido.
 * </p>
 *
 * <p>
 * Esse operador é amplamente utilizado em estruturas condicionais como
 * <code>if</code>, <code>while</code> e <code>for</code>, quando é necessário
 * garantir que múltiplas condições sejam verdadeiras ao mesmo tempo.
 * </p>
 *
 * <p>
 * No método <code>main</code> desta classe serão apresentados exemplos
 * práticos demonstrando o comportamento do operador lógico AND.
 * </p>
 */
public class AulaAND {

    public static void main(String[] args) {

        //Resultado verdadeiro, pois as duas condições são verdadeiras
        int idade = 21;
        float salario = 2500f;
        boolean isDentroDaLei = idade > 18 && salario >= 2500;
        System.out.println(isDentroDaLei);

        //Resultado falso, pois uma das duas condições é falsa
        boolean isMaiorDeIdadeDentroDaLei = idade < 18 && salario >= 2500;
        System.out.println(isMaiorDeIdadeDentroDaLei);

        //Resultado falso, pois as duas condições são falsas
        boolean isDentroDaLeiMaiorDeIdadeESalarioMenor = idade < 18 && salario  < 2500;
        System.out.println(isDentroDaLeiMaiorDeIdadeESalarioMenor);
    }
}