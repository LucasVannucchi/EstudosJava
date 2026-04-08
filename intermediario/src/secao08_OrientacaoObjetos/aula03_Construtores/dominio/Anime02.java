package secao08_OrientacaoObjetos.aula03_Construtores.dominio;

/**

 Classe utilizada para demonstrar <strong>sobrecarga de construtores</strong>

 e o uso da palavra-chave {@code this()} para reutilização de código.

 <p>A classe {@code Anime02} possui múltiplos construtores que permitem
 criar objetos com diferentes quantidades de informações.</p>

 <p>O uso de {@code this()} permite chamar outro construtor da mesma classe,
 evitando repetição de código durante a inicialização dos atributos.</p>
 */
public class Anime02 {

    // Atributos da classe
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;
    private String estudio;

    // Construtor padrão
    public Anime02(){
    }

    // Construtor que inicializa quatro atributos
    public Anime02(String nome, String tipo, String genero, int episodios){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios = episodios;
    }

    // Construtor que inicializa todos os atributos
    public Anime02(String nome, String tipo, String genero, int episodios, String estudio){
        this(nome, tipo, genero, episodios);
        this.estudio = estudio;
    }

    // Método utilizado para inicializar valores manualmente após a criação do objeto
    public void init(String nome, String tipo, String genero, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios = episodios;
    }

    // Método responsável por imprimir os dados do anime
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.estudio);
    }

// Getters e Setters

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

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}