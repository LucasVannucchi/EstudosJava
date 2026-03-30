package secao03_Operadores.aritimeticos;

public class Exercicios {

    public static void main(String[] args) {
//        exercicio1();
        exercicio2();
    }

    public static void exercicio1(){

        int a = 8;
        int b = 4;

        System.out.println("SOMA = " + soma(a, b));
        System.out.println("SUBTRAÇÃO = " + subtracao(a, b));
        System.out.println("MULTIPLICAÇÃO = " + multiplicacao(a, b));
        System.out.println("DIVISÃO = " + divisao(a, b));
    }

    public static void exercicio2(){

        int x = 10;
        int y = 3;

        System.out.println("SOMA = " + soma(x, y));
        System.out.println("MULTIPLICAÇÃO = " + multiplicacao(x, y));
        System.out.println("RESTO DA DIVISÃO = " + restoDivisao(x, y));
    }

    public static int soma(int numero1, int numero2){
        int soma = numero1 + numero2;
        return soma;
    }
    public static int subtracao(int numero1, int numero2){
        int subtracao = numero1 - numero2;
        return subtracao;
    }
    public static int multiplicacao(int numero1, int numero2){
        int multiplicacao = numero1 * numero2;
        return multiplicacao;
    }
    public static int divisao(int numero1, int numero2){
        int divisao = numero1 / numero2;
        return divisao;
    }
    public static int restoDivisao(int numero1, int numero2){
        int restoDivisao = numero1 % numero2;
        return restoDivisao;
    }
}
