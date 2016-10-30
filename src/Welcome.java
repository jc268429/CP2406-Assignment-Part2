import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by aqueries on 30/10/2016.
 */
public class Welcome {
    public JPanel mainPanel;
    private JTextField mineralSuperTrumpsTextField;
    private JButton playButton;
    private JButton exitButton;

    public Welcome() {
        exitButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        }
        );
    }
}
