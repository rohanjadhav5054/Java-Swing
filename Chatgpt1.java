import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

class RoundedButton extends JButton {
    private int cornerRadius;
    
    public RoundedButton(String text, int radius) {
        super(text);
        this.cornerRadius = radius;
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(false);
        setBorder(new EmptyBorder(5, 15, 5, 15)); // Add padding
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Paint background
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius);
        
        // Paint text
        super.paintComponent(g2);
        g2.dispose();
    }
}

class Collage {
    public Collage() {
        JFrame jf = new JFrame();

        // Create rounded button with 20px corner radius
        JButton jb = new RoundedButton("Touch me!", 20);
        jb.setBounds(80, 80, 120, 40); // Larger size for better appearance
        jb.setBackground(Color.BLUE);
        jb.setForeground(Color.BLACK); // Text color
        
        jf.add(jb);
        jf.setTitle("Hello I am xiammy!");
        jf.setLayout(null);
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.LIGHT_GRAY);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}

public class Chatgpt1 {
    public static void main(String[] args) {
        new Collage();
    }
}
