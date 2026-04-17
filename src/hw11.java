import java.awt.*;

public class hw11 {
    static void main(String[] args){

        Frame f = new Frame();
        f.setSize(300, 500);
        f.setVisible(true);
        f.setLayout(null); //flow layout
/*        f.setLayout(new FlowLayout());
        f.setLayout(new FlowLayout((FlowLayout.CENTER), 20, 50)); //flow layout

        f.add(new Button("One"));
        f.add(new Button("Two"));
        f.add(new Button("Three"));*/

/*        f.setLayout(new BorderLayout());
        f.add(new Button("North"), BorderLayout.NORTH);
        f.add(new Button("South"), BorderLayout.SOUTH);
        f.add(new Button("East"), BorderLayout.EAST);
        f.add(new Button("West"), BorderLayout.WEST);
        f.add(new Button("Center"), BorderLayout.CENTER);*/

       /* f.setLayout(new GridLayout(2, 2)); // 2 rows, 2 columns
//        f.setLayout(new GridLayout(0,3));  row is unlimited column is fixed i.e. 3
        f.add(new Button("1"));
        f.add(new Button("2"));
        f.add(new Button("3"));
        f.add(new Button("4"));*/

        Label l=new Label("hello");
        l.setText("New Text");
//        l.setAlignment(Label.CENTER);
        l.setBounds(50,50,200,50);
        f.add(l);

        TextArea ta = new TextArea();
        ta.setText("Hello");
        ta.getText();
        ta.append("More text");
        ta.setBounds(50,100,200,50);
        f.add(ta);

        Checkbox cb = new Checkbox("Accept Terms");
        System.out.println(cb.getState());
        cb.setBounds(50,150,200,50);
        f.add(cb);

        CheckboxGroup g = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male", g, false);
        Checkbox c2 = new Checkbox("Female", g, false);
        c1.setBounds(50,200,200,50);
        c2.setBounds(50,250,200,50);
        //System.out.println(g.getSelectedCheckbox().getLabel());//s will get the label of the checkbox having true state
        f.add(c1);
        f.add(c2);

        Choice choice = new Choice();
        choice.add("Java");
        choice.add("Python");
        choice.add("C++");
        System.out.println(choice.getSelectedItem());
        choice.setBounds(50, 300, 100, 30);
        f.add(choice);

        List list = new List(3);
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
//        List list = new List(3, true);
        System.out.println(list.getSelectedItem());
        list.setBounds(50,350,100,40);
        f.add(list);
    }
}
