package secao02_TiposPrimitivos;

/**
 * <h2>Tipos Primitivos em Java</h2>
 *
 * <p>
 * Um <strong>tipo primitivo</strong> representa um valor simples armazenado diretamente na memória.
 * Diferente de objetos, eles não possuem métodos e são definidos como
 * <strong>palavras reservadas da linguagem</strong>, sempre escritas em <strong>letras minúsculas</strong>.
 * </p>
 *
 * <p>Java possui 8 tipos primitivos:</p>
 * <p><strong>byte, short, int, long, float, double, char e boolean</strong></p>
 *
 * <table border="1" cellpadding="5">
 *   <thead>
 *     <tr>
 *       <th>Tipo</th>
 *       <th>Tamanho</th>
 *       <th>Intervalo (Range)</th>
 *       <th>Valor padrão</th>
 *       <th>Exemplo</th>
 *     </tr>
 *   </thead>
 *   <tbody>
 *     <tr>
 *       <td>byte</td>
 *       <td>1 byte</td>
 *       <td>-128 até 127</td>
 *       <td>0</td>
 *       <td>byte idade = 25;</td>
 *     </tr>
 *     <tr>
 *       <td>short</td>
 *       <td>2 bytes</td>
 *       <td>-32.768 até 32.767</td>
 *       <td>0</td>
 *       <td>short ano = 2025;</td>
 *     </tr>
 *     <tr>
 *       <td>int</td>
 *       <td>4 bytes</td>
 *       <td>-2.147.483.648 até 2.147.483.647</td>
 *       <td>0</td>
 *       <td>int populacao = 1000000;</td>
 *     </tr>
 *     <tr>
 *       <td>long</td>
 *       <td>8 bytes</td>
 *       <td>-9.223.372.036.854.775.808 até 9.223.372.036.854.775.807</td>
 *       <td>0L</td>
 *       <td>long distancia = 9000000000L;</td>
 *     </tr>
 *     <tr>
 *       <td>float</td>
 *       <td>4 bytes</td>
 *       <td>±3.4E38 (aprox.)</td>
 *       <td>0.0f</td>
 *       <td>float preco = 19.99f;</td>
 *     </tr>
 *     <tr>
 *       <td>double</td>
 *       <td>8 bytes</td>
 *       <td>±1.7E308 (aprox.)</td>
 *       <td>0.0d</td>
 *       <td>double salario = 3500.75;</td>
 *     </tr>
 *     <tr>
 *       <td>char</td>
 *       <td>2 bytes</td>
 *       <td>'\u0000' até '\uffff' (0 até 65.535)</td>
 *       <td>'\u0000'</td>
 *       <td>char letra = 'A';</td>
 *     </tr>
 *     <tr>
 *       <td>boolean</td>
 *       <td>JVM dependente</td>
 *       <td>true ou false</td>
 *       <td>false</td>
 *       <td>boolean ativo = true;</td>
 *     </tr>
 *   </tbody>
 * </table>
 *
 * <p>
 * Esses tipos são a base para armazenamento de dados em Java e servem como
 * fundamento para estruturas mais complexas da linguagem.
 * </p>
 */
public class Aula01 {

    public static void main(String[] args) {

        int numero = 0;
        long numeroGrande = 100000l;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'a';

        System.out.println("NUM = " + numero);

    }
}
