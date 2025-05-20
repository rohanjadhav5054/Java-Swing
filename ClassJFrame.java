import javax.swing.JFrame;

public class ClassJFrame extends JFrame {
    public ClassJFrame(){
        setLayout(null);
        // setTitle("This is wen yifan");
        setSize(500, 500);
        setVisible(true);
    }
    public static void main(String args[]){
        ClassJFrame cf = new ClassJFrame();
        cf.setTitle("this is wen yifan ");//we also give title like this 
    }
}
//in this we can directly extending JFrame 
//so don't have to creating Jframe is needed. 
