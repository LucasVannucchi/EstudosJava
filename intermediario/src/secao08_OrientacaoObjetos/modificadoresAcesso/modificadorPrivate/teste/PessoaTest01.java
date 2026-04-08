package secao08_OrientacaoObjetos.modificadoresAcesso.modificadorPrivate.teste;

import secao08_OrientacaoObjetos.modificadoresAcesso.modificadorPrivate.dominio.Pessoa;

/**

 Classe de teste responsável por demonstrar o uso de

 métodos getters e setters em atributos privados.

 <p>Neste exemplo, um objeto da classe {@link Pessoa} é criado
 e seus atributos são definidos através dos métodos

 {@code setNome()} e {@code setIdade()}.</p>

 <p>Os valores armazenados são acessados posteriormente
 utilizando os métodos {@code getNome()} e {@code getIdade()},

 que retornam os dados de forma controlada.</p>
 */
public class PessoaTest01 {

    public static void main(String[] args) {
        // Criação de um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa();

        // Definindo valores utilizando métodos setters
        pessoa.setNome("Karina");
        pessoa.setIdade(47);

        // Acessando os valores utilizando métodos getters
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
