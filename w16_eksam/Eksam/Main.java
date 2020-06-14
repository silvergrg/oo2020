import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.*;

public class Main extends JPanel implements WindowListener, ActionListener {
    int R = 1;
    int Side = 1024;
    Triangle tri = new Triangle();
    ImageIcon showImage = new ImageIcon(tri.generate(Side, R));
    JLabel pilt = new JLabel("Samm " +R);
    

    public Main(){
        //Nupu lisamine aknasse
        JButton inc = new JButton(" +1 ");
        add(inc);
        inc.addActionListener(this);        
        //Kolmnurga lisamine aknasse
        pilt.setIcon(showImage);
        add(pilt);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        R ++;
        showImage = new ImageIcon(tri.generate(Side, R));
        pilt.setText("Samm " +R);
        pilt.setIcon(showImage);
        add(pilt);       
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
//Kasutatud allikas http://theflyingkeyboard.net/2d/java-sierpinski-triangle-recursion/ released under MIT License