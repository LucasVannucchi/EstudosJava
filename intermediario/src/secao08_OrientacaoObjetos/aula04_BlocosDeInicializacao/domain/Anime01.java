package secao08_OrientacaoObjetos.aula04_BlocosDeInicializacao.domain;

public class Anime01 {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

    public Anime01() {
        for (int episodio : this.episodios){
            System.out.println(episodio + " ");
        }
    }
}
