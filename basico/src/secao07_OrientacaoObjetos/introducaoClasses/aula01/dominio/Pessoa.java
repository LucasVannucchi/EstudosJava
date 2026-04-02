package secao07_OrientacaoObjetos.introducaoClasses.aula01.dominio;

/**
 * Representa uma entidade simples do tipo Pessoa.
 *
 * <p>Esta classe é utilizada para demonstrar os conceitos básicos de
 * <strong>Programação Orientada a Objetos (POO)</strong> em Java,
 * especialmente a definição de uma classe e a criação de objetos
 * a partir dela.</p>
 *
 * <p>A classe contém apenas <strong>atributos</strong>, que representam
 * algumas características básicas de uma pessoa. Neste exemplo não
 * foram definidos métodos para simplificar a demonstração do conceito
 * de classe e instanciação.</p>
 *
 * <p>Cada objeto criado a partir desta classe possuirá seus próprios
 * valores para os atributos definidos.</p>
 *
 * <p>Exemplo de criação de objeto:</p>
 *
 * <pre>
 * Pessoa pessoa = new Pessoa();
 * pessoa.nome = "Lucas";
 * pessoa.idade = 22;
 * pessoa.sexo = 'M';
 * </pre>
 *
 * @author
 */
public class Pessoa {

    /** Nome da pessoa. */
    public String nome;

    /** Idade da pessoa. */
    public int idade;

    /** Sexo da pessoa representado por um caractere (ex: 'M' ou 'F'). */
    public char sexo;
}