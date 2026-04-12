import java.awt.*;
import java.awt.event.*;

public class lect27 {
    public static void main(String[] args) {

        Frame f = new Frame("understanding styling");
        f.setLayout(null);
        f.setSize(500, 300);     // width, height
        f.setBackground(Color.GRAY);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {

                System.exit(0);
            }
        });

        Font font = new Font("Arial", Font.BOLD, 24);

        Label h = new Label();
        h.setBounds(10,50,200,50);
        h.setFont(font);
//        h.setBackground(Color.PINK);
        h.setText("Enter your Name :");
        h.setVisible(true);
        f.add(h);

        TextField tf = new TextField();
        tf.setBounds(250, 50, 200, 40);
        tf.setFont(font);
        tf.setVisible(true);
        f.add(tf);

        Button b = new Button("Submit");
        b.setSize(200,200);
        b.setBounds(200,200,100,50);//used to give position and width & height
        b.setVisible(true);// button visible on window
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        f.add(b);

        Label l = new Label();
        l.setBounds(50, 120, 400, 50);
        l.setFont(font);
//        l.setVisible(true);
        l.setBackground(Color.yellow);
        l.setForeground(Color.BLACK);
//        f.add(l);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setVisible(true);
                f.add(l);
                String text = tf.getText();
                l.setText("Input is : "+text.toUpperCase());
            }
        });

    }

}