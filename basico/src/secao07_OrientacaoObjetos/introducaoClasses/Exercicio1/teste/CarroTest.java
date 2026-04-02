package secao07_OrientacaoObjetos.introducaoClasses.Exercicio1.teste;

import secao07_OrientacaoObjetos.introducaoClasses.Exercicio1.dominio.Carro;

public class CarroTest {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.modelo = "Uno";
        carro.marca = "FIAT";
        carro.anoLancado = 1998;

        System.out.println("Carro: " + carro.modelo + " - " + carro.marca + " - " + carro.anoLancado);
    }
}
