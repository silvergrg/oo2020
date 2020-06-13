import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;

public class proov4 {
    public static void main(String[] args) throws Exception{
        PunktmassiPaar paar1 = new PunktmassiPaar(new Punktmass(5, 2), new Punktmass(2, 10));
        PunktmassiPaar paar2 = new PunktmassiPaar(paar1, new Punktmass(3, 15));

        System.out.println(paar2.tekstina(0));

        BufferedImage bi = new BufferedImage(400, 300, BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 400, 300);
        g.setColor(Color.BLACK);
        paar2.joonista(g, 0);
        ImageIO.write(bi, "png", new File("pilt2.png"));
    }
    
}