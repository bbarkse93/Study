package booktest;

import javax.swing.JFrame;

public class FrameTest {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frame Test1");
        f.setSize(300, 200);
        f.setLocation(0, 0);
        f.setVisible(true);
        JFrame g = new JFrame("Frame Test2");
        g.setSize(300, 200);
        g.setLocation(0, 200);
        g.setVisible(true);
    }
}
