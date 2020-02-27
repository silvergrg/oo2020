/**
 * Sailing
 */
public class Sailing {

    public static void main(String[] args) {
        Boats boat1 = new Boats(Type.SLOOP, "Ragamuffin", 33, 30);
        Boats boat2 = new Boats(Type.DINGHY, "Eve", 13, 10);
        Boats boat3 = new Boats(Type.SLOOP, "Spray", 33, 30);
        Boats boat4 = new Boats(Type.YAWL, "Firebird", 68, 48);
        Boats boat5 = new Boats(Type.KETCH, "Joshua", 52, 39);

        Boats[] boats = {boat1, boat2, boat3, boat4, boat5};
        for(int i = 0; i < boats.length; i++){
            System.out.println(boats[i].getInfo());
            boats[i].getHullSpeed(boats[i]);
            boats[i].getMasts(boats[i]);
        }
    }
}