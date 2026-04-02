package secao07_OrientacaoObjetos.introducaoClasses.aula02_Coesao.teste;

import secao07_OrientacaoObjetos.introducaoClasses.aula02_Coesao.dominio.Professor;

public class ProfessorTest {

    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "André";
        professor.idade = 22;
        professor.sexo = 'M';

        System.out.println("Professor: " + professor.nome + " - " + professor.idade + " - " + professor.sexo);
    }
}