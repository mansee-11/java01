import java.awt.*;
import java.awt.event.*;

public class hw12 {

    public static void main(String[] args) {

        Frame f = new Frame("Mouse Event Demo");
        f.setSize(400, 300);
        f.setLayout(null);

        Button b = new Button("Hover Me");
        b.setBounds(150, 120, 100, 40);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

            /*// Mouse Event
            b.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                    b.setBackground(Color.BLUE); // hover color
                }

                public void mouseExited(MouseEvent e) {
                    b.setBackground(Color.BLACK); // normal color
                }
            });*/
        b.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                b.setBackground(new Color(72, 141, 180));
            }

            public void mouseExited(MouseEvent e) {
                b.setBackground(Color.BLACK);
            }

            public void mousePressed(MouseEvent e) {
                b.setBackground(new Color(2,47,86));
            }

            public void mouseReleased(MouseEvent e) {
                b.setBackground(new Color(72, 141, 180));
            }
        });

        f.add(b);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
    }
}
