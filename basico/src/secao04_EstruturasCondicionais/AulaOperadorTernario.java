package secao04_EstruturasCondicionais;

/**
 * <h2>Operador Ternário em Java</h2>
 *
 * <p>
 * O operador ternário é uma forma simplificada de escrever uma estrutura
 * condicional <code>if / else</code>. Ele permite avaliar uma condição e
 * retornar um valor dependendo do resultado dessa avaliação.
 * </p>
 *
 * <p>
 * Esse operador é chamado de "ternário" porque utiliza três partes:
 * </p>
 *
 * <ul>
 *   <li>Uma condição booleana</li>
 *   <li>Um valor retornado caso a condição seja verdadeira</li>
 *   <li>Um valor retornado caso a condição seja falsa</li>
 * </ul>
 *
 * <p>
 * Sua sintaxe é:
 * </p>
 *
 * <pre>
 * condicao ? valorSeVerdadeiro : valorSeFalso;
 * </pre>
 *
 * <p>
 * O operador ternário é muito utilizado para atribuições simples,
 * tornando o código mais conciso. Entretanto, quando a lógica se torna
 * mais complexa, o uso de <code>if / else</code> costuma ser mais legível.
 * </p>
 *
 * <p>
 * No método <code>main</code> desta classe são apresentados exemplos
 * comparando o uso de <code>if / else</code> com o operador ternário.
 * </p>
 */
public class AulaOperadorTernario {

    public static void main(String[] args) {

        int idade = 20;

        // Usando if / else tradicional
        String resultado;

        if (idade >= 18) {
            resultado = "Maior de idade";
        } else {
            resultado = "Menor de idade";
        }

        System.out.println(resultado);

        // Usando operador ternário
        String resultadoTernario = idade >= 18 ? "Maior de idade" : "Menor de idade";

        System.out.println(resultadoTernario);

        // Outro exemplo
        int numero = 7;

        String tipoNumero = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número é: " + tipoNumero);
    }
}