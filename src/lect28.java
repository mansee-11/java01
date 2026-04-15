import java.awt.*;
import java.awt.event.*;
public class lect28 {
    static void main(String[] args){
        Font font = new Font("Arial", Font.BOLD, 16);

        Frame f =new Frame("Two num calculator");
        f.setLayout(null);
        f.setSize(500, 400);
        f.setVisible(true);
        f.setFont(font);
        f.setBackground(new Color(204,222,250));
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {

                System.exit(0);
            }
        });

        Label h1 = new Label();
        h1.setBounds(50,50,200,50);
        h1.setFont(font);
        h1.setText("Enter First No.:");
        h1.setVisible(true);
        f.add(h1);

        Label h2= new Label();
        h2.setBounds(50,100,200,50);
        h2.setFont(font);
        h2.setText("Enter Second No.:");
        h2.setVisible(true);
        f.add(h2);

        TextField t1 = new TextField();
        t1.setBounds(250, 50, 200, 40);
        t1.setFont(font);
        t1.setVisible(true);
        f.add(t1);

        TextField t2 = new TextField();
        t2.setBounds(250, 100, 200, 40);
        t2.setFont(font);
        t2.setVisible(true);
        f.add(t2);

        Button add = new Button("ADD");
        add.setBounds(100,175,100,40);//used to give position and width & height
        add.setVisible(true);// button visible on window
        add.setBackground(new Color(2,24,46));
        add.setForeground(Color.WHITE);
        f.add(add);

        Button sub = new Button("SUBTRACT");
        sub.setBounds(300,175,100,40);//used to give position and width & height
        sub.setVisible(true);// button visible on window
        sub.setBackground(new Color(2,24,46));
        sub.setForeground(Color.WHITE);
        f.add(sub);

        Button multi = new Button("MULTIPLY");
        multi.setBounds(100,225,100,40);//used to give position and width & height
        multi.setVisible(true);// button visible on window
        multi.setBackground(new Color(2,24,46));
        multi.setForeground(Color.WHITE);
        f.add(multi);

        Button divide = new Button("DIVISION");
        divide.setBounds(300,225,100,40);//used to give position and width & height
        divide.setVisible(true);// button visible on window
        divide.setBackground(new Color(2,24,46));
        divide.setForeground(Color.WHITE);
        f.add(divide);

        Label l = new Label();
        l.setBounds(50, 300, 400, 50);
        l.setFont(font);
        l.setBackground(new Color(133,196,228));
        l.setForeground(Color.BLACK);
        f.add(l);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setVisible(true);
                String txt1= t1.getText();
                String txt2=t2.getText();
                int num1=0,num2=0;
                for(char i:txt1.toCharArray())
                {
                    num1*=10;
                    num1+=i-'0';
                }
                for(char i:txt2.toCharArray())
                {
                    num2*=10;
                    num2+=i-'0';
                }
                int result=num1+num2;
                l.setText("Sum : "+result);
            }
        });

        add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                add.setBackground(new Color(110,148,207));
            }
            public void mouseExited(MouseEvent e) {
                add.setBackground(new Color(2,24,46));
            }

            public void mousePressed(MouseEvent e) {
                add.setBackground(new Color(72,141,180));
            }

            public void mouseReleased(MouseEvent e) {
                add.setBackground(new Color(110,148,207));

            }
        });

        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setVisible(true);
                String txt1= t1.getText();
                String txt2=t2.getText();
                int num1=0,num2=0;
                for(char i:txt1.toCharArray())
                {
                    num1*=10;
                    num1+=i-'0';
                }
                for(char i:txt2.toCharArray())
                {
                    num2*=10;
                    num2+=i-'0';
                }
                int result=num1-num2;
                l.setText("Subtraction : "+result);
            }
        });

        sub.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                sub.setBackground(new Color(110,148,207));
            }
            public void mouseExited(MouseEvent e) {
                sub.setBackground(new Color(2,24,46));
            }

            public void mousePressed(MouseEvent e) {
                sub.setBackground(new Color(72,141,180));
            }

            public void mouseReleased(MouseEvent e) {
                sub.setBackground(new Color(110,148,207));

            }
        });

        multi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setVisible(true);
                String txt1= t1.getText();
                String txt2=t2.getText();
                int num1=0,num2=0;
                for(char i:txt1.toCharArray())
                {
                    num1*=10;
                    num1+=i-'0';
                }
                for(char i:txt2.toCharArray())
                {
                    num2*=10;
                    num2+=i-'0';
                }
                int result=num1*num2;
                l.setText("Multiplication : "+result);
            }
        });

        multi.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                multi.setBackground(new Color(110,148,207));
            }
            public void mouseExited(MouseEvent e) {
                multi.setBackground(new Color(2,24,46));
            }

            public void mousePressed(MouseEvent e) {
                multi.setBackground(new Color(72,141,180));
            }

            public void mouseReleased(MouseEvent e) {
                multi.setBackground(new Color(110,148,207));

            }
        });

        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setVisible(true);
                String txt1= t1.getText();
                String txt2=t2.getText();
                int num1=0,num2=0;
                for(char i:txt1.toCharArray())
                {
                    num1*=10;
                    num1+=i-'0';
                }
                for(char i:txt2.toCharArray())
                {
                    num2*=10;
                    num2+=i-'0';
                }
                if(num2 == 0)
                {
                    l.setText("can't divide by zero");

                }
                else
                {
                    int result=num1/num2;
                    l.setText("Division : "+result);
                }

            }
        });

        divide.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                divide.setBackground(new Color(110,148,207));
            }
            public void mouseExited(MouseEvent e) {
                divide.setBackground(new Color(2,24,46));
            }

            public void mousePressed(MouseEvent e) {
                divide.setBackground(new Color(72,141,180));
            }

            public void mouseReleased(MouseEvent e) {
                divide.setBackground(new Color(110,148,207));

            }
        });
    }
}
