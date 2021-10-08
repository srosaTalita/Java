package moduloColecoes.ArrayList.CrudAluno;
import java.util.*;

public class Crud {
    
    //CRUD com ArrayList: Create, Read, Update and Delete :v

    static ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    //Create
    static void create(Aluno a){
        alunos.add(a);
    }

    //Read
    static ArrayList<Aluno> read(){
        return alunos;
    }

    //Update
    static void update(Aluno a){
        for (Aluno aluno : alunos) {
            if(aluno.getId() == aluno.getId()){
                delete(aluno);
                create(a);                
            }
        }
    }

    //Delete
    static void delete(Aluno a){
        alunos.remove(a);
    }
}
