import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by aqueries on 30/10/2016.
 */
public class ChangeTypeFrame extends JFrame implements ActionListener
{
    static Game instance;
    static GUIControl guiInstance;
    FlowLayout flowLayout = new FlowLayout();
    JLabel statusMessage = new JLabel("Please select a new type: ");
    JButton hardnessButton = new JButton("Hardness");
    JButton specificGravityButton = new JButton("Specific Gravity");
    JButton cleavageButton = new JButton("Cleavage");
    JButton crustalAbundanceButton = new JButton("Crustal Abundance");
    JButton economicValueButton = new JButton("Economic Value");

    public static void getGUIControl(GUIControl GUIInstance){
        GUIInstance = guiInstance;

    }

    public ChangeTypeFrame(Game gameInstance)
    {
        setLayout(flowLayout);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instance = gameInstance;
        add(statusMessage);
        add(hardnessButton);
        add(specificGravityButton);
        add(cleavageButton);
        add(crustalAbundanceButton);
        add(economicValueButton);
        hardnessButton.addActionListener(this);
        specificGravityButton.addActionListener(this);
        cleavageButton.addActionListener(this);
        crustalAbundanceButton.addActionListener(this);
        economicValueButton.addActionListener(this);

    }



    public void actionPerformed(ActionEvent e)
    {

        if (e.getSource() == hardnessButton) {
            instance.roundType = "hardness";
            JOptionPane.showMessageDialog(null, "The new type is set to: " + instance.roundType);
            guiInstance.startGamePlay();
            dispose();
        } else if (e.getSource() == specificGravityButton) {
            instance.roundType = "specific gravity";
            JOptionPane.showMessageDialog(null, "The new type is set to: " + instance.roundType);
            guiInstance.startGamePlay();
            dispose();
        } else if (e.getSource() == cleavageButton) {
            instance.roundType = "cleavage";
            JOptionPane.showMessageDialog(null, "The new type is set to: " + instance.roundType);
            guiInstance.startGamePlay();
            dispose();
        } else if (e.getSource() == crustalAbundanceButton) {
            instance.roundType = "crustal abundance";
            JOptionPane.showMessageDialog(null, "The new type is set to: " + instance.roundType);
            guiInstance.startGamePlay();
            dispose();
        } else if (e.getSource() == economicValueButton) {
            instance.roundType = "economic value";
            JOptionPane.showMessageDialog(null, "The new type is set to: " + instance.roundType);
            guiInstance.startGamePlay();
            dispose();
        }
    }
}

