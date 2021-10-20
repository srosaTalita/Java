package POO.aula11;

public class Aluno extends Pessoa{

    public String matricula;
    public String curso;
    public String turma;
    
    @Override
    public boolean equals(Object obj) {
        Aluno aluno = (Aluno)obj;
        if(obj instanceof Aluno){
            if( this.matricula.equals(pessoa.matricula) &&
                this.curso.equals(pessoa.curso) && 
                this.turma.equals(pessoa.turma) &&
                super.equals(pessoa)
            ){
                return true;
            }
        }
        return false;
    }
}
