import javax.swing.*;
import java.awt.*;

class j07 extends JFrame {

    j07()
    {
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImageIcon imageIcon = new ImageIcon("background.jpg");
        JLabel background = new JLabel(imageIcon);
        background.setBounds(0, 0, 400, 400);
        add(background);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Question 7 :  create a frame using javax swing package
        new j07();
    }
}
