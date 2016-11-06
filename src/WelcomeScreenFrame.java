import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by aqueries on 31/10/2016.
 */
public class WelcomeScreenFrame extends JFrame implements ActionListener
{
    static

    JLabel welcomeMessage = new JLabel("Welcome to Mineral Super Trumps");
    JButton playButton = new JButton("Play");
    JButton exitButton = new JButton("Exit");

    JFrame welcomeFrame = new JFrame();





    public WelcomeScreenFrame()
    {

        welcomeFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridBagLayout gridBagLayout = new GridBagLayout();

        welcomeFrame.setLayout(gridBagLayout);

        welcomeFrame.add(welcomeMessage);
        welcomeFrame.add(playButton);
        welcomeFrame.add(exitButton);

        playButton.addActionListener(this);
        exitButton.addActionListener(this);
        getContentPane().setBackground(Color.pink);


        welcomeFrame.pack();
        welcomeFrame.setVisible(true);



    }
    public void actionPerformed(ActionEvent action)
    {
        if (action.getSource() == playButton)
        {
            JOptionPane.showMessageDialog(null, "The Game Will now begin.");
            dispose();
            // write start get players
        }
        else if (action.getSource() == exitButton)
        {
            JOptionPane.showMessageDialog(null, "Exiting, Goodbye.");
            dispose();
            System.exit(0);
        }
    }


}
