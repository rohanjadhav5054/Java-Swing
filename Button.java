import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Button {
    JFrame jf;
    JLabel jl;
    JTextField jt;
    JButton jb;
    
    public Button(){
        jf = new JFrame();  //creating the frame 

        jb = new JButton("Click");//creating the button

        jl = new JLabel("i am not a robot !");//creating the java label 

        jt = new JTextField("This is where you can write it !");

        jb.setBounds(40, 40, 50, 20);//setting bounds button in the frame 
        jf.add(jb);//adding the button in the frame 
        
        jl.setBounds(40, 60, 120, 20);//setting bounds for jabel
        jf.add(jl);//adding label to the frame 

        jt.setBounds(40, 80, 200, 20);
        jf.add(jt);

        

        jf.setTitle("Hello i am su zai zai");//it sets the title for the frame 
        jf.setLayout(null);//it is null because i am telling java i am not setting any layout 
        jf.setSize(400, 400);
        jf.setVisible(true);

        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);//this for it before does not closes at that time 
    }
            
    
    public static void main(String args[]){
        Button cf = new Button();
    }
}
