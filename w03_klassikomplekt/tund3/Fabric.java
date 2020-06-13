public class Fabric{
    private int width;
    private int height;

    private Color color;

    public Fabric(int width, int height, Color color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public Color getColorType(){
        return color;
    }

    public String getColor(){
        String ret;

        switch(color){
            case RED:
                ret = "red";
                break;
            case GREEN:
                ret = "green";
                break;
            case BLUE:
                ret = "blue";
                break;
            default:
                ret = "N/A";
                break;
        }

        return ret;
    }

    public int getArea(){
        return width*height;
    }

    public String getInfo(){
        return "Width: " + width + " Height: " + height + " Color: " + getColor() /*+ " Area: " + getArea()*/;
    }

}