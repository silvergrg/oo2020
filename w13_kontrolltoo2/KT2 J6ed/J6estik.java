import java.util.ArrayList;
import java.util.List;

public class J6estik {
    private List<J6gi> J6ed = new ArrayList<>();

    public void lisaJ6gi(J6gi J6gi){
        J6ed.add(J6gi);
    }

    public void list(){
        for(int i = 0; i<J6ed.size(); i++){
            System.out.println(J6ed.get(i).j6eInfo());
        }
    }

    public int size(){
        return J6ed.size();
    }

    public void getSpecificX(int index){
        J6ed.get(index).vahePunktX();
    }

    public void getSpecificY(int index){
        J6ed.get(index).vahePunktY();
    }


}