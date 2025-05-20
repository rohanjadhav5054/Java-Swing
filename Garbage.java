import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

class Collage{
    public Collage(){
        JFrame jf = new JFrame();

        JButton jb = new JButton("Touch me !");
        jb.setBounds(80,80 , 80, 20);
        jf.add(jb);
        jb.setBackground(Color.GREEN);
        jb.setOpaque(true);
        jb.setBorderPainted(false);

        jf.setTitle("Hello i am xiammy !");
        jf.setLayout(null);
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);//this for it before does not closes at that time 
        jf.getContentPane().setBackground(Color.LIGHT_GRAY);//using these we set colour of beckgroung change 
    }
}
public class Garbage {
    public static void main(String args[]){
        Collage c = new Collage();
    }
}
