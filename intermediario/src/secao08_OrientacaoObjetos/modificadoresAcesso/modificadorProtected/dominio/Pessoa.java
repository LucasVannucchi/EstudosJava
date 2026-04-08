package secao08_OrientacaoObjetos.modificadoresAcesso.modificadorProtected.dominio;

public class Pessoa {
    protected String nome;
    protected int idade;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
