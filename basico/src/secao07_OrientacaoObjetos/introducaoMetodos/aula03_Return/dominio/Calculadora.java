package secao07_OrientacaoObjetos.introducaoMetodos.aula03_Return.dominio;

/**
 * Classe utilizada para demonstrar o uso de <strong>métodos com retorno</strong> em Java.
 *
 * <p>Diferente de métodos do tipo <code>void</code>, métodos com retorno
 * devolvem um valor para quem fez a chamada. Esse valor pode ser armazenado
 * em uma variável, utilizado em expressões ou exibido diretamente.</p>
 *
 * <p>Neste exemplo, a classe {@code Calculadora} possui métodos que recebem
 * dois valores inteiros como parâmetros, realizam operações matemáticas
 * e retornam o resultado da operação.</p>
 *
 * <p>O valor retornado é definido pela palavra-chave <code>return</code>,
 * que finaliza a execução do método e envia o resultado para o ponto
 * onde o método foi chamado.</p>
 */
public class Calculadora {

    /*
     * Recebe 2 valores como parametros, realiza a soma de dois números inteiros e retorna o resultado.
     *
     * num1 valor do primeiro parametro da operação.
     * num2 valor do segundo parametro da operação.
     * return é o resultado da soma entre num1 e num2
     */
    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }
}