import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List stateList=new ArrayList();


    public void addMemento(Memento memento){
        stateList.add(memento);
    }

    public Memento getMemeto(int index){
        return(Memento)  stateList.get(index);
    }
}
