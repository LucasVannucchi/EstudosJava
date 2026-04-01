package secao04_EstruturasCondicionais;

/**
 * <h2>Estrutura Condicional switch em Java</h2>
 *
 * <p>
 * A estrutura condicional <code>switch</code> é utilizada quando precisamos
 * comparar o valor de uma variável com múltiplas possibilidades fixas.
 * Ela torna o código mais organizado e legível em comparação com vários
 * <code>if / else if</code> encadeados.
 * </p>
 *
 * <p>
 * O <code>switch</code> avalia uma expressão e executa o bloco de código
 * correspondente ao <code>case</code> que possui o mesmo valor.
 * </p>
 *
 * <p>
 * A palavra-chave <code>break</code> é utilizada para interromper a execução
 * do <code>switch</code> após um caso ser atendido, evitando que os próximos
 * casos sejam executados em sequência (comportamento conhecido como
 * <em>fall-through</em>).
 * </p>
 *
 * <p>
 * O bloco <code>default</code> é opcional e será executado caso nenhum dos
 * valores dos <code>case</code> corresponda à expressão avaliada.
 * </p>
 *
 * <p>
 * Estrutura básica:
 * </p>
 *
 * <pre>
 * switch (variavel) {
 *     case valor1:
 *         // código executado se variavel == valor1
 *         break;
 *     case valor2:
 *         // código executado se variavel == valor2
 *         break;
 *     default:
 *         // executado se nenhum caso for atendido
 * }
 * </pre>
 *
 * <p>
 * No método <code>main</code> desta classe são apresentados exemplos simples
 * demonstrando o uso da estrutura <code>switch</code> com números inteiros
 * e com <code>String</code>.
 * </p>
 */
public class AulaSwitch {

    public static void main(String[] args) {

        // Exemplo 1: switch com números inteiros
        int diaDaSemana = 3;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }

        // Exemplo 2: switch com String
        String plano = "premium";

        switch (plano) {
            case "basic":
                System.out.println("Plano Básico selecionado.");
                break;
            case "standard":
                System.out.println("Plano Standard selecionado.");
                break;
            case "premium":
                System.out.println("Plano Premium selecionado.");
                break;
            default:
                System.out.println("Plano desconhecido.");
        }
    }
}