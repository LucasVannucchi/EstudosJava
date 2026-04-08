package secao08_OrientacaoObjetos.modificadoresAcesso.modificadorPrivate.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    public void imprimeSalario(){
        if (salarios == null){
            return;
        }

        for (double salario : salarios){
            media += salario;
        }
        media /= salarios.length;

        System.out.printf("Média salarial do funcionario é de: R$%.2f reais.", media);
    }
}
