package secao08_OrientacaoObjetos.modificadoresAcesso.modificadorPublic.teste;

import secao08_OrientacaoObjetos.modificadoresAcesso.modificadorPublic.dominio.Pessoa;

/**

 Classe de teste responsável por demonstrar o acesso direto

 a atributos públicos de uma classe.

 <p>Neste exemplo, um objeto da classe {@link Pessoa} é criado
 e seus atributos públicos {@code nome} e {@code idade}

 são modificados diretamente fora da classe.</p>

 <p>Após atribuir os valores, o método {@code imprime()}
 é chamado para exibir as informações no console.</p>
 */
public class PessoaTest01 {

    public static void main(String[] args) {
        // Criação de um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa();

        // Atribuindo valores diretamente aos atributos públicos
        pessoa1.nome = "Lucas";
        pessoa1.idade = 22;

        // Chamando o método que imprime os dados da pessoa
        pessoa1.imprime();

    }
}