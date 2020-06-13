/**
 * Geometry
 */
public class Geometry {

    private Shape shape;
    private float radius;
    private float height;

    public Geometry(Shape shape, float radius, float height) {
        this.shape = shape;
        this.radius = radius;
        this.height = height;
    }

    public String getShape(){
        if(shape == Shape.RECTANGLE){
            return "Rectangle";
        }else if(shape == Shape.TRIANGLE){
            return "Triangle";
        }else if(shape == Shape.CIRCLE){
            return "Circle";
        }else{
            return "Unknown";
        }
    }

    public float getRadius(){
        return radius;
    }

    public float getHeight(){
        return height;
    }

    public void Perimeter(Shape shape){
        if(shape == Shape.RECTANGLE){
            System.out.println("Ristküliku ümbermõõt on: " + 2*(radius + height));
        }else if(shape == Shape.TRIANGLE){
            System.out.println("Kolmnurga ümbermõõt on: " + radius*3);
        }else if(shape == Shape.CIRCLE){
            System.out.println("Ringi ümbermõõt on " + 2*3.14*radius);
        }
    }

    public void Surface(Shape shape){
        if(shape == Shape.RECTANGLE){
            System.out.println("Ristküliku pindala on: " + radius*height);
        }else if(shape == Shape.TRIANGLE){
            System.out.println("Kolmnurga pindala on: " + radius*height/2);
        }else if(shape == Shape.CIRCLE){
            System.out.println("Ringi ümbermõõt on " + 3.14*radius*radius);
        }
    }

}