
import javax.swing.JFrame;


public class SimpleJavaSwing{
    
    public static void main(String args[]){
        // new JavaSwing();

        SimpleJavaSwing js = new SimpleJavaSwing();

    }

    public SimpleJavaSwing() {
        JFrame jFrame = new JFrame();  //creating the frame 
        jFrame.setTitle("Hello i am su zai zai");//it sets the title for the frame 
        jFrame.setLayout(null);//it is null because i am telling java i am not setting any layout 
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
    }
}
//Jframe can be create in two ways 
//1] in the class create j frame and call it.
//2] it is created using extends Jframe to class 
//creating java frame 