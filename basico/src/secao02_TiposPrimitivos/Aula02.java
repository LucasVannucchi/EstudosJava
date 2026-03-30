package secao02_TiposPrimitivos;

/**
 * <h2>Tipos Primitivos e Conversão de Tipos (Casting) em Java</h2>
 *
 * <p>
 * Esta classe demonstra o uso dos principais <strong>tipos primitivos da linguagem Java</strong>
 * e exemplos de <strong>conversão de tipos (casting)</strong>.
 * </p>
 *
 * <p>
 * Tipos primitivos representam valores simples armazenados diretamente na memória
 * e são definidos por palavras reservadas da linguagem. Java possui oito tipos
 * primitivos: <strong>byte, short, int, long, float, double, char e boolean</strong>.
 * </p>
 *
 * <p>
 * Também são demonstradas duas formas de conversão entre tipos numéricos:
 * </p>
 *
 * <ul>
 *   <li>
 *     <strong>Widening Casting (conversão implícita)</strong>: ocorre automaticamente
 *     quando um tipo menor é convertido para um tipo maior, sem risco de perda de dados.
 *     <br>Exemplo: <code>int → long → float → double</code>
 *   </li>
 *   <li>
 *     <strong>Narrowing Casting (conversão explícita)</strong>: precisa ser feito manualmente
 *     utilizando parênteses, pois pode haver perda de informação.
 *     <br>Exemplo: <code>double → float → long → int → short → byte</code>
 *   </li>
 * </ul>
 *
 * <p>
 * O objetivo deste exemplo é apresentar a declaração de variáveis primitivas
 * e ilustrar como realizar conversões entre tipos numéricos em Java.
 * </p>
 */
public class Aula02 {

    public static void main(String[] args) {

        // Tipos inteiros
        int numero = 0; // int é o tipo inteiro mais utilizado em Java
        long numeroGrande = 100000L; // literais long podem usar o sufixo 'L'

        // Tipos de ponto flutuante
        double salarioDouble = 2000.0; // double é o tipo padrão para números decimais
        float salarioFloat = 2500.0F; // float exige o sufixo 'F'

        // Tipos inteiros menores
        byte idadeByte = 10; // ocupa 1 byte
        short idadeShort = 10; // ocupa 2 bytes

        // Tipo lógico
        boolean verdadeiro = true;
        boolean falso = false;

        // Tipo caractere
        char caractere = 'A'; // armazena um único caractere Unicode

        System.out.println("Numero: " + numero);

        // ============================
        // Casting (Conversão de Tipos)
        // ============================

        // Widening Casting (automático)
        int valorInt = 100;
        long valorLong = valorInt; // int -> long
        double valorDouble = valorLong; // long -> double

        System.out.println("Casting implícito (int -> long -> double): " + valorDouble);

        // Narrowing Casting (explícito)
        double numeroDouble = 9.78;
        int numeroInt = (int) numeroDouble; // double -> int (perde a parte decimal)

        System.out.println("Casting explícito (double -> int): " + numeroInt);

        // Outro exemplo de narrowing
        long numeroLong = 1000L;
        byte numeroByte = (byte) numeroLong; // possível perda de dados dependendo do valor

        System.out.println("Casting explícito (long -> byte): " + numeroByte);
    }
}