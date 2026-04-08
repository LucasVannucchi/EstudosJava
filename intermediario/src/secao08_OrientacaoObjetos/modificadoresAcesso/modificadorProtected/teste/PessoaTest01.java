package secao08_OrientacaoObjetos.modificadoresAcesso.modificadorProtected.teste;

import secao08_OrientacaoObjetos.modificadoresAcesso.modificadorProtected.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Karina");
        pessoa.setIdade(47);
        pessoa.imprime();
    }
}
