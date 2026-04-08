package secao08_OrientacaoObjetos.aula01_ModificadoresAcesso.modificadorPrivate.dominio;

/**

 Classe utilizada para demonstrar o uso do modificador de acesso <strong>private</strong>.

 <p>Quando um atributo é declarado como {@code private}, ele só pode ser acessado
 diretamente dentro da própria classe. Isso é uma prática importante de

 <strong>encapsulamento</strong>, pois protege os dados contra alterações indevidas.</p>

 <p>Para permitir o acesso controlado aos atributos, são utilizados métodos
 especiais chamados <strong>getters</strong> e <strong>setters</strong>.</p>

 <p>Neste exemplo:</p>
 <ul>
 <li>{@code setNome()} e {@code setIdade()} permitem alterar os valores.</li>
 <li>{@code getNome()} e {@code getIdade()} permitem acessar os valores.</li>
 </ul>
 <p>Também é realizada uma validação no método {@code setIdade()} para impedir
 que uma idade negativa seja atribuída.</p>
 */
public class Pessoa {

    // Atributos privados acessíveis apenas dentro da própria classe
    private String nome;
    private int idade;

    // Método responsável por definir o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método responsável por definir a idade da pessoa com validação
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade invalida!");
            return;
        }
        this.idade = idade;
    }

    // Método responsável por retornar o nome da pessoa
    public String getNome() {
        return this.nome;
    }

    // Método responsável por retornar a idade da pessoa
    public int getIdade() {
        return this.idade;
    }
}