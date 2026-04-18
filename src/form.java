import java.awt.*;
import java.awt.event.*;

public class form {
    static void main(String[] args){

        Font font = new Font("Arial", Font.BOLD, 16);

        Frame f=new Frame();
        f.setSize(600,600);
        f.setVisible(true);
        f.setLayout(null);
        f.setFont(font);
        f.setBackground(new Color(250,247,230));

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {

                System.exit(0);
            }
        });

        Label n=new Label("Name :");
        n.setBounds(50,50,100,50);
        n.setVisible(true);
        f.add(n);

        TextField name = new TextField();
        name.setBounds(150,60,200,30);
        name.setVisible(true);
        f.add(name);

        Checkbox c=new Checkbox("I Agree to show data");
        c.setBounds(50,100,200,50);
        c.setVisible(true);
        f.add(c);

        CheckboxGroup g=new CheckboxGroup();
        Checkbox c1=new Checkbox("Male",g,false);
        Checkbox c2=new Checkbox("Female",g,false);
        c1.setBounds(50,150,75,50);
        c2.setBounds(150,150,100,50);
        f.add(c1);
        f.add(c2);

        Choice choice = new Choice();
        choice.add("select language");
        choice.add("Java");
        choice.add("Python");
        choice.add("C++");
        choice.setBounds(50,200,150,50);
        f.add(choice);

        List list = new List(6,true);
        list.add("singing");
        list.add("dancing");
        list.add("reading");
        list.add("coding");
        list.add("cooking");
        list.add("traveling");
        list.setBounds(50,250,150,70);
        f.add(list);

        Button b=new Button("submit");
        b.setBounds(50,350,100,50);
        f.add(b);
        b.setBackground(new Color(206,188,171));

        b.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b.setBackground(new Color(250,247,230));
            }
            public void mouseExited(MouseEvent e) {
                b.setBackground(new Color(206,188,171));

            }

            public void mousePressed(MouseEvent e) {
                b.setBackground(new Color(206,188,171));
            }

            public void mouseReleased(MouseEvent e) {
                b.setBackground(new Color(250,247,230));
            }
        });
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean state =c.getState();
                if(state)
                {
                    Label l1=new Label("Name : "+name.getText());
                    l1.setBounds(270,100,200,50);
                    l1.setVisible(true);
                    l1.setBackground(new Color(206,188,171));
                    f.add(l1);

                    Label l2=new Label();
                    if(g.getSelectedCheckbox() != null) {
                        l2.setText("Gender : " + g.getSelectedCheckbox().getLabel());
                    } else {
                        l2.setText("Gender : null");
                    }
                    l2.setBounds(270,150,200,50);
                    l2.setVisible(true);
                    l2.setBackground(new Color(206,188,171));
                    f.add(l2);

                    Label l3=new Label("language : "+choice.getSelectedItem());
                    l3.setBounds(270,200,200,50);
                    l3.setVisible(true);
                    l3.setBackground(new Color(206,188,171));
                    f.add(l3);

                    String[] selected = list.getSelectedItems();
                    String result = "Hobbies: ";

                    for(String item : selected) {
                        result += item + " ";
                    }
                    Label l4=new Label(result);
                    if(selected.length == 0) {
                        l4.setText("No hobby selected");
                    }
                    l4.setBounds(50,450,400,50);
                    l4.setVisible(true);
                    l4.setBackground(new Color(206,188,171));
                    f.add(l4);
                }
                else
                {
                    Label l4=new Label("Not permitted to show data");
                    l4.setBounds(50,450,400,50);
                    l4.setVisible(true);
                    l4.setBackground(new Color(206,188,171));
                    f.add(l4);

                }
            }
        });
    }
}
