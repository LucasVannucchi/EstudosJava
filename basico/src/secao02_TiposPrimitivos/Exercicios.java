package secao02_TiposPrimitivos;

/*
    Prática:

    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>,
    confirmo que recebi o salario de <salario>, na data <data>
 */

public class Exercicios {

    public static void main(String[] args) {

        String nome = "Lucas";
        String endereco = "Rua teste";
        double salario = 2500.80;
        String data = "01/04/2026";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salario de " + salario + ", na data " + data);
    }
}
