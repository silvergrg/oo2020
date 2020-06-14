import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

public class Main extends JPanel implements WindowListener, ActionListener {
    int R = 1;
    TextField tf= new TextField(String.valueOf(R));    

    public Main(){        
        //Kolmnurga lisamine aknasse
        Triangle tri = new Triangle();
        ImageIcon showImage = new ImageIcon(tri.generate(512, R));
        JLabel pilt = new JLabel("Samm " +R);
        pilt.setIcon(showImage);
        add(pilt);
        //Nupu lisamine aknasse
        JButton inc = new JButton(" +1 ");
        add(inc);
        add(tf);
        inc.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        R = Integer.parseInt(tf.getText());
        super.repaint();
    }
    
    public static void main(String[] args) throws Exception {
        
        JFrame f = new JFrame("Pilt");
        f.add(new Main());
        f.setSize(800, 600);
        f.setVisible(true);
    }

    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
}