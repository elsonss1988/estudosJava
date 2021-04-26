package br.com.elson;

import javax.swing.*;

public class primeiraClasse {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        String nome= JOptionPane.showInputDialog("Qual o seu Nome?");
        aluno1.setNome(nome);

        String idade=JOptionPane.showInputDialog("Qual a sua idade");
        aluno1.setIdade(Integer.valueOf(idade));

        String nascimento=JOptionPane.showInputDialog("Qual a sua data de nascimento");
        aluno1.setDataNascimento(nascimento);

        String rg=JOptionPane.showInputDialog("Qual o seu RG");
        aluno1.setRegistroGeral(rg);

        String cpf=JOptionPane.showInputDialog("Qual o seu CPF");
        aluno1.setNumeroCPF(cpf);

        String nomeMae=JOptionPane.showInputDialog("Qual o nome da sua mae");
        aluno1.setNomeMae(nomeMae);

        String nomePai=JOptionPane.showInputDialog("Qual o nome do seu Pai");
        aluno1.setNomePai(nomePai);

        String matricula = JOptionPane.showInputDialog("Qual a sua matricula");
        aluno1.setDataMatricula(matricula);

        String serie=JOptionPane.showInputDialog("Qual a sua serie");
        aluno1.setSerieMatriculado(serie);

        String nota1=JOptionPane.showInputDialog("Qual a sua Nota1");
        aluno1.setNota1(Double.parseDouble(nota1));

        String nota2=JOptionPane.showInputDialog("Qual a sua nota 2");
        aluno1.setNota2(Double.parseDouble(nota2));

        String nota3=JOptionPane.showInputDialog("Qual a sua Nota 3");
        aluno1.setNota3(Double.parseDouble(nota3));

        String nota4=JOptionPane.showInputDialog("Qual a sua nota4");
        aluno1.setNota4(Double.parseDouble(nota4));

        System.out.println(aluno1);
        System.out.println(aluno1.toString());
        System.out.println("Nome é= "+ aluno1.getNome());
        System.out.println("Idade é= "+ aluno1.getIdade());
        System.out.println("Nascimento é= "+ aluno1.getDataNascimento());
        System.out.println("Media da nota é ="+aluno1.getMediaNota());
        System.out.println("Resultado =" + (aluno1.getAlunoAprovado()?"Aprovado":"Reprovado"));



        Aluno aluno2 = new Aluno();
        aluno2.setNome("Pedro");
        aluno2.setIdade(40);
        aluno2.setDataNascimento("10/10/1987");

        System.out.println("*************************************");
        System.out.println("Nome é= "+ aluno2.getNome());
        System.out.println("Idade é= "+ aluno2.getIdade());
        System.out.println("Nascimento é= "+ aluno2.getDataNascimento());

        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno("Maria");
        Aluno aluno5 = new Aluno("Jose",50);

        Aluno aluno6= new Aluno();
        aluno6.setNome("Alex");
        //aluno6.setNumeroCPF("123");

        Aluno aluno7= new Aluno();
        aluno7.setNome("Alex");
        //aluno1.setNumeroCPF("123");

        if(aluno1.equals(aluno2)){
            System.out.println("Alunos são iguais");
        }else{
            System.out.println("Alunos não são iguais");
        }

    }
}
