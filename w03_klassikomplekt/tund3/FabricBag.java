import java.util.ArrayList;
import java.util.List;
/**
 * FabricBag
 */
public class FabricBag {

    private List<Fabric> bag = new ArrayList<>();

    public void addFabric(Fabric fabric){
        bag.add(fabric);
    }

    public void removeFabric(int index){
        bag.remove(index);
    }

    public void getSpecific(int index){
        bag.get(index).getInfo();
    }

    public void list(){
        for(int i = 0; i < bag.size(); i++){
            System.out.println("Fabric: " + i + " " + bag.get(i).getInfo());
        }
    }
    //Funktsioon, mis prindib välja ainult teatud värviga objektid
    public void listColor(Color color){
        for(int i = 0; i < bag.size(); i++){
            if(bag.get(i).getColorType() == color) {
                System.out.println("Fabric: " + i + " " + bag.get(i).getInfo());
            }
        }
    }

    public int getTotalArea(){
        int total = 0;

        for (Fabric fabric : bag){
            total += fabric.getArea();
        }

        return total;
    }


}