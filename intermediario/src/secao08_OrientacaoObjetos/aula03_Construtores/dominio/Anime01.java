package secao08_OrientacaoObjetos.aula03_Construtores.dominio;

/**

 Classe utilizada para demonstrar o conceito de <strong>construtores</strong> em Java.

 <p>Construtores são métodos especiais executados automaticamente
 no momento em que um objeto é criado utilizando a palavra {@code new}.</p>

 <p>Neste exemplo, a classe {@code Anime01} possui dois construtores:</p>
 <ul>
 <li>Um construtor vazio (padrão)</li>
 <li>Um construtor que recebe todos os atributos necessários para inicializar o objeto</li>
 </ul>
 <p>Isso permite criar objetos já com valores definidos no momento da
 instânciação.</p>
 */
public class Anime01 {

    // Atributos da classe
    private String nome;
    private String tipo;
    private String genero;
    private int episodios;

    // Construtor que recebe todos os atributos
    public Anime01(String nome, String tipo, String genero, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.genero = genero;
        this.episodios = episodios;
    }

    // Construtor padrão (vazio)
    public Anime01(){
    }

    // Método responsável por imprimir os dados do anime
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodios);
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
}