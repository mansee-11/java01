import java.awt.*;

public class lect26 extends Frame{
    lect26(){
        Button b=new Button("click");
        b.setBounds(50,100,100,50);
        setSize(200,200);
        setLayout(null);
        setVisible(true);
        add(b);
    }
    static void main(String[] args){
        lect26 obj = new lect26();
    }
}
