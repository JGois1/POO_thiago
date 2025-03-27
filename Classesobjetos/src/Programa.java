public class Programa {

    //atalho main + enter
    public static void main(String[] args) {
        //tem que estar nessa ordem de atributos
        Aluno aluno1 = new Aluno("01","João","CDIA");
        Aluno aluno2 = new Aluno("02","Vanessa","ADS");
        aluno2.trocarDeCurso("ES");

        //atalho sout + enter
        System.out.println(aluno2.curso); //linha 7 
        aluno2.trocarDeCurso("ES");
        System.out.println(aluno2.curso);

        System.out.println(aluno2.nome);
        aluno2.mudarNome("Janaina");
        System.out.println(aluno2.nome);;
    }

}
