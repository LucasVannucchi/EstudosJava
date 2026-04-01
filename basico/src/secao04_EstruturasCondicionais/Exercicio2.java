package secao04_EstruturasCondicionais;

public class Exercicio2 {

    public static void main(String[] args) {

        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana.
        // Considerando 1 domingo.

        int dia = 5;

        switch (dia){
            default:
                System.out.println("Opção invalida!");
                break;
            case 1:
                System.out.println("Final de semana!");
                break;
            case 2:
                System.out.println("Dia útil!");
                break;
            case 3:
                System.out.println("Dia útil!");
                break;
            case 4:
                System.out.println("Dia útil!");
                break;
            case 5:
                System.out.println("Dia útil!");
                break;
            case 6:
                System.out.println("Dia útil!");
                break;
            case 7:
                System.out.println("Final de semana!");
                break;
        }

        //Versão abreviada
        switch (dia){
            default:
                System.out.println("Opção invalida!");
                break;
            case 1, 7:
                System.out.println("Final de semana!");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil!");
                break;
        }
    }
}
