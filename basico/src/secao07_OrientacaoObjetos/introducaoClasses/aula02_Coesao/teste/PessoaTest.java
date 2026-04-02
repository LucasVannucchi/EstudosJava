package secao07_OrientacaoObjetos.introducaoClasses.aula02_Coesao.teste;

import secao07_OrientacaoObjetos.introducaoClasses.aula02_Coesao.dominio.Pessoa;

public class PessoaTest {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Lucas";
        pessoa1.idade = 22;
        pessoa1.sexo = 'M';

        System.out.println("Pessoa 1: " + pessoa1.nome + " - " + pessoa1.idade + " - " + pessoa1.sexo);
    }
}