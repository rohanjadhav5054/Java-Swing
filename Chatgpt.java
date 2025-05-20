//here background and buuton is coloured 
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

class Collage {
    public Collage() {
        JFrame jf = new JFrame();

        JButton jb = new JButton("Touch me!");
        jb.setBounds(80, 80, 100, 30);  // Increased width and height for better visibility
        jb.setBackground(Color.GREEN);
        jb.setOpaque(true);
        jb.setBorderPainted(false);
        jf.add(jb);

        jf.setTitle("Hello I am xiammy!");  // Fixed capitalization
        jf.setLayout(null);
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Used JFrame instead of jf
        jf.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        // Center the frame on screen
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);  // Moved to the end as a best practice
    }
}

public class Chatgpt {
    public static void main(String[] args) {  // Fixed the array declaration
        new Collage();  // No need to store in variable if not used later
    }
} 
    

