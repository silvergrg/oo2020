/**
 * Boats
 */
public class Boats {

    private Type type;
    private String name;
    private double LOA;
    private double LWL;

    public Boats(Type type, String name, double LOA, double LWL){
        this.type = type;
        this.name = name;
        this.LOA = LOA;
        this.LWL = LWL;
    }

    public Type getType(){
        return type;
    }

    public String getTypeName(){
        String ret;

        switch(type){
            case DINGHY:
                ret = "Dinghy";
                break;
            case SLOOP:
                ret = "Sloop";
                break;
            case KETCH:
                ret = "Ketch";
                break;
            case YAWL:
                ret = "Yawl";
                break;
            default:
                ret = "N/A";
                break;
        }

        return ret;
    }

    public String getName(){
        return name;
    }

    public double getLOA(){
        return LOA;
    }

    public double getLWL(){
        return LWL;
    }

    public String getInfo(){
        return "Name: " + name + " Type: " + getTypeName() + " Length overall: " + LOA + " Loaded waterline length: " + LWL;
    }

    public void getHullSpeed(Boats boats){
        System.out.println("Hull speed: " +  Math.round(1.34 * Math.sqrt(LWL)) + " kts");
    }

    public void getMasts(Boats boats){
        if(type == Type.DINGHY || type == Type.SLOOP){
            System.out.println("Single mast");
        }else if(type == Type.KETCH || type == Type.YAWL){
            System.out.println("Two-masted");
        }else{
            System.out.println("Unknown sail plan");
        }
    }
}