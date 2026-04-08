package secao08_OrientacaoObjetos.modificadoresAcesso.modificadorPrivate.teste;

import secao08_OrientacaoObjetos.modificadoresAcesso.modificadorPrivate.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("André");
        funcionario.setIdade(52);
        funcionario.setSalarios(new double[]{5000, 3000, 4500.58});

        System.out.println("Nome do funcionario é: " + funcionario.getNome());
        System.out.println("Idade do funcionario é: " + funcionario.getIdade());
        funcionario.imprimeSalario();
    }
}
