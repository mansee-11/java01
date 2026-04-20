import java.awt.*;
import java.awt.event.*;

public class hw13 {
    static void main(String[] args){
        Frame f=new Frame();
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);

        Checkbox cb = new Checkbox("Accept");
        cb.setBounds(50,50,50,50);

        cb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(cb.getState()) {
                    System.out.println("Checked");
                } else {
                    System.out.println("Unchecked");
                }
            }
        });

        f.add(cb);
        Choice choice =new Choice();
        choice.add("language");
        choice.add("Java");
        choice.add("Python");
        choice.add("C++");
        choice.setBounds(50,100,100,50);
        f.add(choice);
        choice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String selected = choice.getSelectedItem();
                System.out.println("Selected: " + selected);
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {

                System.exit(0);
            }
        });

        TextField name=new TextField();
        name.setBounds(50,150,100,50);
        f.add(name);
        name.addKeyListener(new KeyAdapter() {

            public void keyReleased(KeyEvent e) {
                System.out.println("Typing: " + name.getText());
            }
        });
    }
}
