package automaton641.project.senses;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class SSwing {
    JFrame frame;
    SCanvas canvas;

    public void show() {
        frame.setVisible(true);
    }

    class SCanvas extends JComponent {
        BufferedImage image;
        public SCanvas(int width, int height) {
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        }
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++) {
                    //image.setRGB(x, y);
                }
            }
            graphics.drawImage(image, 0, 0, this);
        }
    }

    public SSwing(SWindow window, String title, int width, int height) {
        canvas = new SCanvas(width, height);
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.add(canvas);
    }

    public void repaint() {
        canvas.repaint();
    }
}
