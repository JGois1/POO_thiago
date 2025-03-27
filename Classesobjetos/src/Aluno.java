public class Aluno {

    //atributo da classe
    String matricula, nome, curso;

    //parametros / metodo construtor
    public Aluno(String id, String name, String course) {
        this.matricula = id;
        this.nome = name;
        this.curso = course;
    }

    public void trocarDeCurso(String novoCurso) {
        this.curso = novoCurso;
    }
    public void mudarNome(String novoNome) {
        this.nome = novoNome;
    }

}
