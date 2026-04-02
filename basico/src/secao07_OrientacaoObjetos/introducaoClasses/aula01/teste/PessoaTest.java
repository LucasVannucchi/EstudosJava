package secao07_OrientacaoObjetos.introducaoClasses.aula01.teste;

import secao07_OrientacaoObjetos.introducaoClasses.aula01.dominio.Pessoa;

/**
 * Classe de teste responsável por demonstrar a criação e utilização
 * de objetos da classe {@link Pessoa}.
 *
 * <p>Este exemplo mostra o processo de <strong>instanciação de objetos</strong>,
 * atribuição de valores aos atributos e acesso a esses dados.</p>
 *
 * <p>Dois objetos da classe {@code Pessoa} são criados e recebem valores
 * diferentes para seus atributos, demonstrando que cada objeto possui
 * seu próprio estado.</p>
 *
 * <p>Ao final, os dados das pessoas são exibidos no console utilizando
 * {@code System.out.println}.</p>
 */
public class PessoaTest {

    public static void main(String[] args) {

        // Criando objetos a partir da classe Pessoa
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        // Atribuindo valores aos atributos
        pessoa1.nome = "Lucas";
        pessoa1.idade = 22;
        pessoa1.sexo = 'M';

        pessoa2.nome = "André";
        pessoa2.idade = 52;
        pessoa2.sexo = 'M';

        // Exibindo os dados dos objetos
        System.out.println("Pessoa 1: " + pessoa1.nome + " - " + pessoa1.idade + " - " + pessoa1.sexo);
        System.out.println("Pessoa 2: " + pessoa2.nome + " - " + pessoa2.idade + " - " + pessoa2.sexo);
    }
}