import java.awt.*;

public class hw14 extends Frame {

    public void paint(Graphics g) {

        g.setColor(Color.BLUE);
        g.drawString("Hello Graphics", 100, 50);

        g.setColor(Color.RED);
        g.drawLine(50, 100, 200, 100);

        g.setColor(Color.GREEN);
        g.drawRect(50, 150, 100, 50);

        g.setColor(Color.ORANGE);
        g.fillRect(200, 150, 100, 50);

        g.setColor(Color.MAGENTA);
        g.drawOval(50, 250, 100, 100);

        g.setColor(Color.CYAN);
        g.fillOval(200, 250, 100, 100);
    }

    public static void main(String[] args) {
        hw14 f = new hw14();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
