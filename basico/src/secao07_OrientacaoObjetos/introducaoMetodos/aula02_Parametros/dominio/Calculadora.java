package secao07_OrientacaoObjetos.introducaoMetodos.aula02_Parametros.dominio;

/**
 * Classe utilizada para demonstrar o uso de <strong>métodos com parâmetros</strong> em Java.
 *
 * <p>Diferente de métodos sem parâmetros, métodos parametrizados recebem
 * valores no momento da chamada. Esses valores são utilizados dentro
 * do método para executar determinada lógica.</p>
 *
 * <p>Neste exemplo, a classe {@code Calculadora} possui métodos que recebem
 * dois números inteiros como parâmetros {@code int num1 e int num2} e realizam operações matemáticas
 * simples, exibindo o resultado no console.</p>
 *
 * <p>Esse conceito permite que um mesmo método seja reutilizado com
 * diferentes valores, tornando o código mais flexível e reutilizável.</p>
 */
public class Calculadora {

    //Recebe 2 valores como parametros, realiza a soma de dois números inteiros e exibe o resultado no console.
    // num1 valor do primeiro parametro da operação.
    // num2 valor do segundo parametro da operação.
    public void somar(int num1, int num2) {
        System.out.println("O VALOR DA SOMA É: " + (num1 + num2));
    }

    public void subtrair(int num1, int num2) {
        System.out.println("O VALOR DA SUBTRAÇÃO É: " + (num1 - num2));
    }
}