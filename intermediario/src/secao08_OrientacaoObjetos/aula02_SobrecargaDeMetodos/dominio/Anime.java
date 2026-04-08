package secao08_OrientacaoObjetos.aula02_SobrecargaDeMetodos.dominio;

/**

 Classe utilizada para demonstrar o conceito de <strong>sobrecarga de métodos (method overloading)</strong> em Java.

 <p>A sobrecarga ocorre quando dois ou mais métodos possuem o <strong>mesmo nome</strong>,
 porém com <strong>parâmetros diferentes</strong> (quantidade ou tipos diferentes).</p>

 <p>Neste exemplo, o método {@code init()} é declarado duas vezes:</p>
 <ul>
 <li>Uma versão recebe {@code nome}, {@code tipo} e {@code episodios}</li>
 <li>Outra versão recebe {@code nome}, {@code tipo}, {@code genero} e {@code episodios}</li>
 </ul>
 <p>Dessa forma, o mesmo método pode ser chamado de maneiras diferentes
 dependendo das informações disponíveis no momento da criação do objeto.</p>

 <p>A classe também possui o método {@code imprimeAnime()}, responsável por
 exibir no console os dados do anime.</p>
 */
public class Anime {

    // Atributos da classe
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;

    // Método init sobrecarregado que recebe três parâmetros
    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    // Método init sobrecarregado que recebe quatro parâmetros
    public void init(String nome, String tipo, String genero, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios = episodios;
    }

    // Método responsável por imprimir os dados do anime
    public void imprimeAnime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
    }

// Métodos getters e setters para acesso controlado aos atributos

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return this.episodios;
    }
}