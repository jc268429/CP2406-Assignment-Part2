import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by aqueries on 6/11/2016.
 */

public class PlayerAmtFrame extends JFrame implements ActionListener
{
    static GUIControl gInstance;
    static Game instance;
    static GUIControl guiControl;
    static int playerAmt = 0;

    FlowLayout flowLayout = new FlowLayout();
    JLabel statusMessage = new JLabel("How Many Players are Playing?");
    JButton threePlayerBtn = new JButton("3 players");
    JButton fourPlayersBtn = new JButton("4 players");
    JButton fivePlayersBtn = new JButton("5 players");

    public static void getGUIControl(GUIControl guiInstance)
    {
        gInstance = guiInstance;
    }


    public PlayerAmtFrame(Game gameInstance)
    {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(flowLayout);
        add(statusMessage);
        add(threePlayerBtn);
        add(fourPlayersBtn);
        add(fivePlayersBtn);
        threePlayerBtn.addActionListener(this);
        fourPlayersBtn.addActionListener(this);
        fivePlayersBtn.addActionListener(this);
        instance = gameInstance;

    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == threePlayerBtn)
        {
            instance.playerAmt = 3;
            gInstance.startPlayerSetup();
            dispose();

        }
        else if (e.getSource() == fourPlayersBtn)
        {
            instance.playerAmt = 4;
            gInstance.startPlayerSetup();
            dispose();

        }
        else if (e.getSource() == fivePlayersBtn)
        {
            instance.playerAmt = 5;
            gInstance.startPlayerSetup();
            dispose();
        }
    }

}
