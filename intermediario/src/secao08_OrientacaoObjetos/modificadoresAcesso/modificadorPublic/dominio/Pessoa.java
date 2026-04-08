package secao08_OrientacaoObjetos.modificadoresAcesso.modificadorPublic.dominio;

/**

 Classe utilizada para demonstrar o uso do modificador de acesso <strong>public</strong> em atributos e métodos.

 <p>Quando um atributo ou método é declarado como {@code public}, ele pode ser acessado
 diretamente por qualquer outra classe, inclusive de outros pacotes.</p>

 <p>Neste exemplo, a classe {@code Pessoa} possui dois atributos públicos:
 {@code nome} e {@code idade}. Como são públicos, seus valores podem ser definidos

 diretamente fora da classe.</p>

 <p>Também existe o método {@code imprime()}, responsável por exibir no console
 os valores armazenados nos atributos da classe.</p>
 */
public class Pessoa {

    // Atributos públicos que podem ser acessados diretamente por outras classes
    public String nome;
    public int idade;

    // Método responsável por exibir os dados da pessoa no console
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}