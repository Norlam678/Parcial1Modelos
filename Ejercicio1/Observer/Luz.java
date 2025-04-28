package Observer;

import java.util.ArrayList;

public class Luz implements Observer{
    ArrayList<Curso> cursos =  new ArrayList<>();

    @Override
    public void update(ArrayList<Cursos> cursos){
        this.cursos = cursos;
    }

    public void notificar(){
        for(Curso curso: cursos){
            
        }
    }
}
