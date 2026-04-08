package secao08_OrientacaoObjetos.aula03_Construtores.teste;

import secao08_OrientacaoObjetos.aula03_Construtores.dominio.Anime02;

/**

 Classe de teste responsável por demonstrar o uso de

 <strong>sobrecarga de construtores</strong>.

 <p>Neste exemplo, diferentes formas de criação de objetos
 da classe {@link Anime02} são utilizadas.</p>

 <p>Cada construtor permite inicializar o objeto com diferentes
 quantidades de informações.</p>
 */
public class AnimeTest02 {

    public static void main(String[] args) {
        // Criando objeto usando construtor vazio e inicializando com método init
        Anime02 anime02 = new Anime02();
        anime02.init("Black clover", "Magia", "Ficção", 2000);
        anime02.imprime();

        System.out.println("-----------------------");

        // Criando objeto usando construtor com quatro parâmetros
        Anime02 animeSobrecarga1 = new Anime02("Nome do Anime", "Tipo do Anime", "Genero do anime", 1);
        animeSobrecarga1.imprime();

        // Criando objeto usando construtor com cinco parâmetros
        Anime02 animeSobrecarga2 = new Anime02("One Piece", "pirata", "Ficção", 45000, "Sei lá");
        animeSobrecarga2.imprime();
    }
}
