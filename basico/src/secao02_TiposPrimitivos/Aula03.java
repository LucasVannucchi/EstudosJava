
package secao02_TiposPrimitivos;

/**
 * <h2>Tipo de Referência String em Java</h2>
 *
 * <p>
 * Diferente dos <strong>tipos primitivos</strong>, a classe <strong>String</strong> é um
 * <strong>tipo de referência</strong>. Isso significa que a variável não armazena
 * diretamente o valor do texto, mas sim uma referência para um objeto que está
 * localizado na memória.
 * </p>
 *
 * <p>
 * A classe <code>String</code> pertence ao pacote <code>java.lang</code>, que é
 * importado automaticamente pelo Java. Por esse motivo, não é necessário realizar
 * importação manual para utilizá-la.
 * </p>
 *
 * <p>
 * Strings são usadas para representar <strong>sequências de caracteres</strong>
 * e são declaradas utilizando aspas duplas (<code>" "</code>).
 * </p>
 *
 * <p>
 * Outro ponto importante é que objetos <code>String</code> são <strong>imutáveis</strong>.
 * Isso significa que, após serem criados, seu conteúdo não pode ser alterado.
 * Qualquer operação que modifique o texto resulta na criação de um novo objeto.
 * </p>
 *
 * <p>
 * Neste exemplo, o método <code>main</code> demonstra a declaração de uma variável
 * do tipo <code>String</code> contendo uma mensagem simples.
 * </p>
 */
public class Aula03 {

    public static void main(String[] args) {

        // Tipo de referência que armazena uma sequência de caracteres
        String texto = "Olá mundo!";

        System.out.println(texto);
    }
}