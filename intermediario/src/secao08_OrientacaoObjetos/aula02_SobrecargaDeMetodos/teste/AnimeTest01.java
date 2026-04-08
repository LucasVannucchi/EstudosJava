package secao08_OrientacaoObjetos.aula02_SobrecargaDeMetodos.teste;

import secao08_OrientacaoObjetos.aula02_SobrecargaDeMetodos.dominio.Anime;

/**

 Classe de teste responsável por demonstrar o funcionamento

 da <strong>sobrecarga de métodos</strong>.

 <p>Neste exemplo, um objeto da classe {@link Anime} é criado
 e o método {@code init()} é chamado utilizando duas versões

 diferentes do método.</p>

 <p>A primeira chamada utiliza três parâmetros e a segunda
 utiliza quatro parâmetros, demonstrando que métodos com o

 mesmo nome podem executar comportamentos diferentes dependendo

 da assinatura utilizada.</p>
 */
public class AnimeTest01 {

    public static void main(String[] args) {
        // Criação de um objeto da classe Anime
        Anime anime = new Anime();

        // Chamando a primeira versão do método init (3 parâmetros)
        anime.init("Haikyuu", "TV", 25);

        // Chamando a segunda versão do método init (4 parâmetros)
        anime.init("Haikyuu", "TV", "Esporte", 25);

        // Exibindo os dados do anime no console
        anime.imprimeAnime();
    }
}
