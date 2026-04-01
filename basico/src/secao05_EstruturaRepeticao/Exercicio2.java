package secao05_EstruturaRepeticao;

public class Exercicio2 {

    public static void main(String[] args) {

        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //condição valorParcela >= 1000

        double valorCarro = 65000;
        for (int parcela = 1; parcela <= valorCarro; parcela++){
             double valorParcela = valorCarro / parcela;
             if (valorParcela >= 1000){
                 System.out.printf("Parcela %d R$ %.2f%n", parcela, valorParcela);
             }else {
                 break;
             }
            System.out.println("fora do if: " + parcela);
        }
    }
}
