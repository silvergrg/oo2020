/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        FabricBag bag = new FabricBag();

        Fabric fabric1 = new Fabric(2, 5, Color.RED);
        Fabric fabric2 = new Fabric(4, 6, Color.BLUE);
        Fabric fabric3 = new Fabric(15, 7, Color.GREEN);
        Fabric fabric4 = new Fabric(4, 5, Color.RED);
        Fabric fabric5 = new Fabric(2, 16, Color.BLUE);

        bag.addFabric(fabric1);
        bag.addFabric(fabric2);
        bag.addFabric(fabric3);
        bag.addFabric(fabric4);
        bag.addFabric(fabric5);

        bag.list();
        System.out.println();
        bag.listColor(Color.RED);
        System.out.println();
        System.out.println(bag.getTotalArea());
    }
}