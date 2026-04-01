package secao05_EstruturaRepeticao;

public class Exercicio1 {

    public static void main(String[] args) {

        //imprima todos os numeros pares de 0 até 1000000 com FOR
        for (int i = 0; i <= 1000000; i++){
            if (i % 2 == 0) {
                System.out.println("Dentro do For " + i);
            }
        }

        //imprima todos os numeros pares de 0 até 1000000 com WHILE
        int numero = 1000000;
        int i = 0;
        while ( i <= numero){
            if (i % 2 == 0) {
                System.out.println("Dentro do While: " + i);
            }
            i++;
        }

        //imprima todos os numeros pares de 0 até 1000000 com Do While
        numero = 1000000;
        i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println("Dentro do Do While: " + i);
            }
            i++;
        } while ( i <= numero);
    }
}
