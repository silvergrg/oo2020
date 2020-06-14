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

    public BufferedImage generate(final int triangleSize, final int recursionLevel){
        BufferedImage bi = new BufferedImage(triangleSize, triangleSize, BufferedImage.TYPE_INT_RGB);
        graphics2D = bi.createGraphics();

        graphics2D.setColor(bgColor);
        graphics2D.fillRect(0, 0, triangleSize, triangleSize);      //Kolmnurga jaoks valge taust

        graphics2D.setColor(fgColor);
        graphics2D.setStroke(new BasicStroke(lineSize));            //

        int triangleHeight = (int) Math.round(triangleSize* Math.sqrt(3.0d) / 2.0d);
        Point pointA = new Point(0, triangleHeight);                //Alumine vasak nurk
        Point pointB = new Point(triangleSize/2, 0);                //Ülemine nurk
        Point pointC = new Point(triangleSize, triangleHeight);     //Alumine parem nurk

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

        //Kui ei ole baas, jaga kolmnurga küljed pooleks
        Point pointAB = middlePoint(pointA, pointB);
        Point pointBC = middlePoint(pointB, pointC);
        Point pointAC = middlePoint(pointA, pointC);

        //Proovi uuesti kolmnurka joonistada
        drawTriangle(pointA, pointAB, pointAC, recursionLevel - 1);
        drawTriangle(pointAB, pointB, pointBC, recursionLevel - 1);
        drawTriangle(pointAC, pointBC, pointC, recursionLevel - 1);
    }

    //Külje keskpunkti leidmine
    private Point middlePoint(Point point1, Point point2){
        return new Point((point1.x + point2.x)/2, (point1.y + point2.y)/2);
    }


}