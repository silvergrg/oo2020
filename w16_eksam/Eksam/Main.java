import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.*;

public class Main extends JPanel implements WindowListener{
    private int R = 1;
    private int Side = 1024;
    private Triangle tri = new Triangle();
    private ImageIcon showImage = new ImageIcon(tri.generate(Side, R));
    private JLabel pilt = new JLabel("Samm " +R);
    

    public Main(){
        //Nuppude lisamine aknasse
        JButton inc = new JButton(" +1 ");
        add(inc);
        inc.addActionListener(new IncrementButton());
        JButton reset = new JButton("Lähtesta");
        add(reset);
        reset.addActionListener(new ResetButton());
        JButton print = new JButton("Prindi");
        add(print);
        print.addActionListener(new PrintButton());        
        //Kolmnurga lisamine aknasse
        pilt.setIcon(showImage);
        add(pilt);        
        
    }
    private class IncrementButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            R ++;
            showImage = new ImageIcon(tri.generate(Side, R));
            pilt.setText("Samm " +R);
            pilt.setIcon(showImage);
            add(pilt);       
        }
    }
    private class ResetButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            R = 1;
            showImage = new ImageIcon(tri.generate(Side, R));
            pilt.setText("Samm " +R);
            pilt.setIcon(showImage);
            add(pilt);       
        }
    }
    private class PrintButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                ImageIO.write(tri.generate(Side, R), "png", new File("pilt.png"));
            }   catch (Exception exc){
                exc.printStackTrace();
            }    
        }
    }
    public static void main(String[] args) throws Exception {
        
        JFrame f = new JFrame("Sierpinski kolmnurk");      
        f.add(new Main());
        f.setSize(1200, 1200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
}