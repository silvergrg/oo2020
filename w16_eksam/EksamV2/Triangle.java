import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Triangle
 */
public class Triangle {

    private final Color fgColor;
    private final Color bgColor;
    private Graphics2D graphics2D;
    private final int lineSize;

    public Triangle(){
        this.fgColor = Color.BLACK;
        this.bgColor = Color.WHITE;
        lineSize = 1;
    }

    public Triangle(final Color fgColor, final Color bgColor, final int lineSize){
        this.fgColor = fgColor;
        this.bgColor = bgColor;
        this.lineSize = lineSize;
    }

    public BufferedImage generate(final int triangleSideB, final int triangleSideL, final int triangleSideR, final int recursionLevel){
        BufferedImage bi = new BufferedImage(triangleSideB, triangleSideL, BufferedImage.TYPE_INT_RGB);
        graphics2D = bi.createGraphics();

        graphics2D.setColor(bgColor);
        graphics2D.fillRect(0, 0, triangleSideB, triangleSideB);      //Kolmnurga jaoks valge taust

        graphics2D.setColor(fgColor);
        graphics2D.setStroke(new BasicStroke(lineSize));            //

        int triangleHeightL = (int) Math.round(triangleSideL* Math.sqrt(3.0d) / 2.0d);
        //int triangleHeightT = (int) Math.round(triangleSideL* Math.sqrt(3.0d) / 2.0d);
        int triangleHeightR = (int) Math.round(triangleSideR* Math.sqrt(3.0d) / 2.0d);
        Point pointA = new Point(0, triangleHeightL);                //Alumine vasak nurk
        Point pointB = new Point(triangleSideB/2, 0);                //Ülemine nurk
        Point pointC = new Point(triangleSideR, triangleHeightR);     //Alumine parem nurk

        drawTriangle(pointA, pointB, pointC, recursionLevel);

        return bi;
    }

    private void drawTriangle(Point pointA, Point pointB, Point pointC, int recursionLevel){
        //Baasjuht - joonista kolmnurk
        if(recursionLevel == 1){       
            Polygon polygon = new Polygon();
            polygon.addPoint(pointA.x, pointA.y);
            polygon.addPoint(pointB.x, pointB.y);
            polygon.addPoint(pointC.x, pointC.y);

            graphics2D.draw(polygon);
            return;
        }

        //Kui ei ole baas, jaga kolmnurga küljed osadeks
        Point pointAB = frac1Point(pointA, pointB);
        Point pointBC = frac2Point(pointB, pointC);
        Point pointAC = frac3Point(pointA, pointC);

        //Proovi uuesti kolmnurka joonistada
        drawTriangle(pointA, pointAB, pointAC, recursionLevel - 1);
        drawTriangle(pointAB, pointB, pointBC, recursionLevel - 1);
        drawTriangle(pointAC, pointBC, pointC, recursionLevel - 1);
    }

    //Külje keskpunkti leidmine
    private Point frac1Point(Point point1, Point point2){
        return new Point((point1.x + point2.x)/2, (point1.y + point2.y)/2);
    }

    private Point frac2Point(Point point1, Point point2){
        //return new Point((point1.x + point2.x)/2, (point1.y + point2.y)/2);
        int sideLen = (int) Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2) )/3;
        int x = (int)Math.round(sideLen* 0.5);
        int y = (int)Math.round(sideLen * 0.866);
        return new Point(point2.x - x, point2.y - y);
    }

    private Point frac3Point(Point point1, Point point2){
        return new Point((point1.x + point2.x)/2, (point1.y + point2.y)/2);
    }


}
//Kasutatud allikas http://theflyingkeyboard.net/2d/java-sierpinski-triangle-recursion/ released under MIT License