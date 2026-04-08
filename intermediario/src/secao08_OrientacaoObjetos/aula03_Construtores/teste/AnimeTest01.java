package secao08_OrientacaoObjetos.aula03_Construtores.teste;

import secao08_OrientacaoObjetos.aula03_Construtores.dominio.Anime01;

/**

 Classe de teste responsável por demonstrar a utilização

 de construtores com parâmetros.

 <p>Neste exemplo, um objeto da classe {@link Anime01} é criado
 utilizando um construtor que recebe valores para todos os atributos.</p>

 <p>Após a criação do objeto, o método {@code imprime()} é chamado
 para exibir as informações no console.</p>
 */
public class AnimeTest01 {

    public static void main(String[] args) {
        // Criando um objeto utilizando o construtor com parâmetros
        Anime01 anime01 = new Anime01("Haikyuu", "esporte", "ação", 1000);

        // Exibindo os dados do anime
        anime01.imprime();
    }
}
