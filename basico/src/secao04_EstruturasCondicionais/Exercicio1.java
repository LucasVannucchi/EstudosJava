package secao04_EstruturasCondicionais;

public class Exercicio1 {

    public static void main(String[] args) {

        double salario = 12000;

        if (salario <= 34712) {
            System.out.printf("Valor a pagar: %.2f", (salario * 9.70) / 100);
        } else if (salario <= 68507) {
            System.out.printf("Valor a pagar: %.2f", (salario * 37.35) / 100);
        } else {
            System.out.printf("Valor a pagar: %.2f", (salario * 49.50) / 100);
        }
    }
}